package irvine.oeis.a111;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A111110 Expansion of x*(x^4 - x^3 + 4x^2 - 3x + 1)/(1 - 5x + 9x^2 - 8x^3 + 2x^4 - x^5).
 * @author Georg Fischer
 */
public class A111110 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A111110() {
    super(0, new long[] {0, 1, -3, 4, -1, 1},
      new long[] {1, -5, 9, -8, 2, -1});
  }
}
