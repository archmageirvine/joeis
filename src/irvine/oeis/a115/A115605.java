package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115605 Expansion of <code>-x^2*(2 + x - 2*x^2 - x^3 + 2*x^4) / ( (x-1)*(1+x)*(1 + x + x^2)*(x^2 - x + 1)*(x^2 + 4*x - 1)*(x^2 - x - 1) )</code>.
 * @author Sean A. Irvine
 */
public class A115605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115605() {
    super(new long[] {1, 3, -6, -3, 1, 0, -1, -3, 6, 3}, new long[] {0, 0, 2, 7, 31, 128, 549, 2315, 9826, 41594});
  }
}
