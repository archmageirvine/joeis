package irvine.oeis.a047;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A047854 a(n) = A047848(6, n).
 * @author Georg Fischer
 */
public class A047854 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A047854() {
    super(0, new long[] {1, -8},
      new long[] {1, -10, 9});
  }
}
