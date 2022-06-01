package irvine.oeis.a115;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A115412 G.f.: (x - 1)/(x^5 - x^3 - x^2 - x - 1).
 * @author Sean A. Irvine
 */
public class A115412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115412() {
    super(new long[] {1, 0, -1, -1, -1}, new long[] {1, -2, 1, 0, 1});
  }
}
