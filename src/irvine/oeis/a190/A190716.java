package irvine.oeis.a190;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A190716 a(2*n) = 2*n and a(2*n-1) = A054569(n).
 * @author Georg Fischer
 */
public class A190716 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A190716() {
    super(1, new long[] {0, 1, 2, 4, -2, 3},
      new long[] {1, 0, -3, 0, 3, 0, -1});
  }
}
