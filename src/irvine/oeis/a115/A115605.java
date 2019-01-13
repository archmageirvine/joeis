package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115605.
 * @author Sean A. Irvine
 */
public class A115605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115605() {
    super(new long[] {1, 3, -6, -3, 1, 0, -1, -3, 6, 3}, new long[] {0, 0, 2, 7, 31, 128, 549, 2315, 9826, 41594});
  }
}
