package irvine.oeis.a304;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A304579 a(n) = (n^2 + 1)*(n^2 + 2).
 * @author Georg Fischer
 */
public class A304579 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A304579() {
    super(0, new long[] {2, -4, 20, 0, 6},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
