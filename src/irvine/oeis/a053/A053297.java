package irvine.oeis.a053;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A053297 Row sums of array T in A053199.
 * @author Georg Fischer
 */
public class A053297 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A053297() {
    super(1, new long[] {0, 1, -3, 2},
      new long[] {1, -8, 20, -16, 4});
  }
}
