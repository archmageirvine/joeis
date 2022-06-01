package irvine.oeis.a115;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A115413 G.f.: (x - 1)/(1 - x^2 + x^3 + x^4 - x^5).
 * @author Sean A. Irvine
 */
public class A115413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115413() {
    super(new long[] {1, -1, -1, 1, 0}, new long[] {-1, 1, -1, 2, -1});
  }
}
