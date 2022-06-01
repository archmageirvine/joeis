package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019584 a(n) = n^2*(n-1)^3/4.
 * @author Sean A. Irvine
 */
public class A019584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019584() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 1, 18, 108, 400});
  }
}
