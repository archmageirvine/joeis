package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290055 Expansion of <code>x*(1 + 4*x + x^2)/((1 - x)^5*(1 + x)^4)</code>.
 * @author Sean A. Irvine
 */
public class A290055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290055() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {0, 1, 5, 10, 26, 40, 80, 110, 190});
  }
}
