package irvine.oeis.a061;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A061222 a(n) = n^2 + (n + 1)^3 + (n + 2)^4.
 * @author Georg Fischer
 */
public class A061222 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A061222() {
    super(0, new long[] {17, 5, 7, -7, 2},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
