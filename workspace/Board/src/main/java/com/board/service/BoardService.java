package com.board.service;

import java.util.List;

import com.board.domain.BoardDTO;

public interface BoardService {

	public boolean registerBoard(BoardDTO params);

	public BoardDTO getBoardDetail(Long idx);

	public boolean deleteBoard(Long idx);
	
	public boolean updateNotice(Long idx);
	
	public long updateViewCnt(Long idx);

	public List<BoardDTO> getBoardList();

}