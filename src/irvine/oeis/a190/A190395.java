package irvine.oeis.a190;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A190395 Number of ways to place 3 nonattacking grasshoppers on a chessboard of size n x n.
 * @author Georg Fischer
 */
public class A190395 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A190395() {
    super(1, new long[] {0, 0, -4, -48, -68, -16, 28, -12},
      new long[] {-1, 7, -21, 35, -35, 21, -7, 1});
  }
}
