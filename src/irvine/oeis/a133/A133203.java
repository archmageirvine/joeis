package irvine.oeis.a133;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A133203 a(n) = a(n-1) + 8*n + 4, n &gt; 2.
 * @author Georg Fischer
 */
public class A133203 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A133203() {
    super(0, new long[] {0, 1, 0, 25, -18},
      new long[] {1, -3, 3, -1});
  }
}
