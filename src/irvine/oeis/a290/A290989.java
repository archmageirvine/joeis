package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290989 Expansion of x^6*(1 + x^3)/(1 - 4*x + 5*x^2 - x^3 - 2*x^4 + x^6 + x^7 - 2*x^8 + x^9).
 * @author Sean A. Irvine
 */
public class A290989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290989() {
    super(new long[] {-1, 2, -1, -1, 0, 2, 1, -5, 4}, new long[] {1, 4, 11, 26, 55, 109, 208, 389, 722});
  }
}
