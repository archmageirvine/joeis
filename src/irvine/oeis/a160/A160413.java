package irvine.oeis.a160;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A160413 a(n) = A160411(n+1)/4.
 * @author Georg Fischer
 */
public class A160413 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A160413() {
    super(1, new long[] {0, 2, 1, 3, 0, 1},
      new long[] {1, 0, -2, 0, 1});
  }
}
