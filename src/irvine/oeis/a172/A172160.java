package irvine.oeis.a172;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A172160 a(0)=1. a(n) = 2^(n-2)*(5-n), for n&gt;0.
 * @author Georg Fischer
 */
public class A172160 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A172160() {
    super(0, new long[] {1, -2, -1},
      new long[] {1, -4, 4});
  }
}
