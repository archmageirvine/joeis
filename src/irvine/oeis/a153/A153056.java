package irvine.oeis.a153;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A153056 a(0)=2, a(n) = n^2+a(n-1).
 * @author Georg Fischer
 */
public class A153056 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A153056() {
    super(0, new long[] {2, -5, 7, -2},
      new long[] {1, -4, 6, -4, 1});
  }
}
