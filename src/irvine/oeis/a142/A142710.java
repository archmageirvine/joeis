package irvine.oeis.a142;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A142710 a(n) = A142585(n) + A142586(n).
 * @author Georg Fischer
 */
public class A142710 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A142710() {
    super(0, new long[] {2, -2, -12, 12, 14, 0, -4},
      new long[] {1, -2, -7, 12, 11, -16, 4});
  }
}
