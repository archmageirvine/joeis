package irvine.oeis.a061;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A061995 Number of ways to place 2 nonattacking kings on an n X n board.
 * @author Georg Fischer
 */
public class A061995 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A061995() {
    super(0, new long[] {0, 0, 0, -16, 2, 2},
      new long[] {-1, 5, -10, 10, -5, 1});
  }
}
