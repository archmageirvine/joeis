package irvine.oeis.a261;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A261799 Number of 7-compositions of n: matrices with 7 rows of nonnegative integers with positive column sums and total element sum n.
 * @author Georg Fischer
 */
public class A261799 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A261799() {
    super(0, new long[] {1, -7, 21, -35, 35, -21, 7, -1},
      new long[] {1, -14, 42, -70, 70, -42, 14, -2});
  }
}
