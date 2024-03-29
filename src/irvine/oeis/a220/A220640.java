package irvine.oeis.a220;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A220640 Number of ways to reciprocally link elements of an n X 4 array either to themselves or to exactly one king-move neighbor.
 * @author Georg Fischer
 */
public class A220640 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A220640() {
    super(0, new long[] {1, -15, -42, 70, 58, -14, 1, -3},
      new long[] {1, -20, -114, 325, 340, -460, -245, 48, -2, 15});
  }
}
