package irvine.oeis.a282;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A282737 Expansion of (x^6 - x^4 + x^3 - x - 1)/((x - 1)^3*(x + 1)^2).
 * @author Georg Fischer
 */
public class A282737 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A282737() {
    super(0, new long[] {-1, -1, 0, 1, -1, 0, 1},
      new long[] {-1, 1, 2, -2, -1, 1});
  }
}
