package irvine.oeis.a195;

import irvine.oeis.FiniteSequence;

/**
 * A195897 Number of ways to place a queen, a rook, a bishop, a knight and a king on an n X n chessboard such that each piece attacks the same number of unoccupied spaces.
 * @author Georg Fischer
 */
public class A195897 extends FiniteSequence {

  /** Construct the sequence. */
  public A195897() {
    super(4, FINITE, 28, 39, 90, 63, 64, 197, 15, 7, 5, 1);
  }
}
