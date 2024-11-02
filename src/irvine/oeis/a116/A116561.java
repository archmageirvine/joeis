package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116561 Expansion of g.f. x*(1 +4*x +4*x^2 +18*x^3 +7*x^4 +7*x^5 -2*x^6 -x^7 -x^8 -x^9) / (1-20*x^6+x^12).
 * @author Sean A. Irvine
 */
public class A116561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116561() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 4, 18, 7, 7, 18, 79, 79, 359, 140});
  }
}
