package irvine.oeis.a114;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A114239 a(n) = (n+1)(n+2)^3*(n+3)(n^2 + 4n + 5)/120.
 * @author Georg Fischer
 */
public class A114239 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A114239() {
    super(0, new long[] {1, 10, 20, 10, 1},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
