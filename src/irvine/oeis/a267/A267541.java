package irvine.oeis.a267;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A267541 Expansion of (2 + 4*x + x^2 + x^3 + 2*x^4 + x^5)/(1 - x - x^5 + x^6).
 * @author Sean A. Irvine
 */
public class A267541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267541() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {2, 6, 7, 8, 10, 13});
  }
}
