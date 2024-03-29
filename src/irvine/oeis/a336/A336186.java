package irvine.oeis.a336;
// Generated by gen_seq4.pl filtpos at 2023-09-08 10:19

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a185.A185505;

/**
 * A336186 Side length of a square block of integers, with 1 at the top-left corner, on a diagonally numbered 2D board such that the sum of the integers in the square is a perfect square.
 * @author Georg Fischer
 */
public class A336186 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A336186() {
    super(1, 1, new A185505(), SQUARE);
  }
}
