package irvine.oeis.a054;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A054111 Row sums of array T as in A054110.
 * @author Georg Fischer
 */
public class A054111 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A054111() {
    super(0, new long[] {1, 0, 2, 4},
      new long[] {1, -2, -1, 2});
  }
}
