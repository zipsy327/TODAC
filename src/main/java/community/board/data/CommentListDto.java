package community.board.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class CommentListDto {
    private int boardCode;
    private String memberNickname;
    private String memberPhoto;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private Timestamp registerDate;
    private String content;
    private int userCode;

    public CommentListDto(BoardCommentDto boardCommentDto) {
        boardCode = boardCommentDto.getBoard().getBoardcode();
        memberNickname = boardCommentDto.getMember().getNickname();
        memberPhoto = boardCommentDto.getMember().getPhoto();
        registerDate = boardCommentDto.getRegistereddate();
        content = boardCommentDto.getContent();
        userCode = boardCommentDto.getMember().getUsercode();
    }

}
