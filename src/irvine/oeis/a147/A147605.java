package irvine.oeis.a147;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A147605 G.f.: 1/(1 + x - x^3 - 2*x^4 - 3*x^5 - 5*x^6 - 7*x^7 - 5*x^8 - 3*x^9 - 2*x^10 - x^11 + x^13 + x^14).
 * @author Georg Fischer
 */
public class A147605 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A147605() {
    super(0, new long[] {1},
      new long[] {1, 1, 0, -1, -2, -3, -5, -7, -5, -3, -2, -1, 0, 1, 1});
  }
}
