package irvine.oeis.a172;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A172203 Number of ways to place 4 nonattacking kings on a 4 X n board.
 * @author Georg Fischer
 */
public class A172203 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A172203() {
    super(1, new long[] {0, 0, 0, -9, -34, -149, 4, -68},
      new long[] {-1, 5, -10, 10, -5, 1});
  }
}
