package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227582 Expansion of <code>(2+3*x+2*x^2+2*x^3+3*x^4+x^5-x^6)/(1-2*x+x^2-x^5+2*x^6-x^7)</code>.
 * @author Sean A. Irvine
 */
public class A227582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227582() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {2, 7, 14, 23, 35, 50, 67});
  }
}
