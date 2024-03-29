package irvine.oeis.a190;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A190398 Number of ways to place 3 nonattacking grasshoppers on a toroidal chessboard of size n x n.
 * @author Georg Fischer
 */
public class A190398 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A190398() {
    super(1, new long[] {0, 0, -4, -44, -76, 0, -44, 140, -148, 68, -12},
      new long[] {-1, 7, -21, 35, -35, 21, -7, 1});
  }
}
