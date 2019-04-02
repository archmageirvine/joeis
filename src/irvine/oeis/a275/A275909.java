package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275909 Expansion of (1+4*x+8*x^2+8*x^3+7*x^4+4*x^5+2*x^6) / (1-x-7*x^2-12*x^3-6*x^4-7*x^5-4*x^6-2*x^7).
 * @author Sean A. Irvine
 */
public class A275909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275909() {
    super(new long[] {2, 4, 7, 6, 12, 7, 1}, new long[] {1, 5, 20, 75, 288, 1094, 4171});
  }
}
