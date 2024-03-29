package irvine.oeis.a078;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A078486 Expansion of (x-7*x^2+19*x^3-21*x^4+10*x^5-6*x^6) / (1-9*x+31*x^2-53*x^3+44*x^4-16*x^5+6*x^6).
 * @author Georg Fischer
 */
public class A078486 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A078486() {
    super(0, new long[] {0, 1, -7, 19, -21, 10, -6},
      new long[] {1, -9, 31, -53, 44, -16, 6});
  }
}
