package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076808 a(n) = 82n^3 - 1228n^2 + 6130n - 5861.
 * @author Sean A. Irvine
 */
public class A076808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076808() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-5861, -877, 2143, 3691});
  }
}
