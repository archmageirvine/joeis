package irvine.oeis.a304;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A304164 a(n) = 27*n^2 - 21*n + 6 (n&gt;=1).
 * @author Georg Fischer
 */
public class A304164 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A304164() {
    super(1, new long[] {0, 12, 36, 6},
      new long[] {1, -3, 3, -1});
  }
}
