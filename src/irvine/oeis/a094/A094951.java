package irvine.oeis.a094;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A094951 a(n) = A081038(n) + A077616(n).
 * @author Georg Fischer
 */
public class A094951 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A094951() {
    super(1, new long[] {0, -6, 23, -27},
      new long[] {-1, 9, -27, 27});
  }
}
