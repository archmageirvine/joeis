package irvine.oeis.a298;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A298078 a(n) = 7*n^2 - 7*n - 43.
 * @author Georg Fischer
 */
public class A298078 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A298078() {
    super(1, new long[] {0, -43, 100, -43},
      new long[] {1, -3, 3, -1});
  }
}
