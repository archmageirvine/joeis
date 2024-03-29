package irvine.oeis.a179;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A179403 Number of ways to place 2 nonattacking kings on an n X n toroidal board.
 * @author Georg Fischer
 */
public class A179403 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A179403() {
    super(1, new long[] {0, 0, 0, 0, -56, 80, -46, 10},
      new long[] {-1, 5, -10, 10, -5, 1});
  }
}
