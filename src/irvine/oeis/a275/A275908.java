package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275908 Expansion of (1+2*x+4*x^2+4*x^3+6*x^4+4*x^5+x^6) / (1-3*x-x^2-6*x^3-7*x^4-7*x^5-5*x^6-x^7).
 * @author Sean A. Irvine
 */
public class A275908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275908() {
    super(new long[] {1, 5, 7, 7, 6, 1, 3}, new long[] {1, 5, 20, 75, 288, 1105, 4234});
  }
}
