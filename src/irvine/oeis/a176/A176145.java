package irvine.oeis.a176;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A176145 a(n) = n*(n-3)*(n^2-7*n+14)/8.
 * @author Georg Fischer
 */
public class A176145 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A176145() {
    super(3, new long[] {0, 0, 0, 0, 1, 0, 3, -1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
