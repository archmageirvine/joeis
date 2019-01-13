package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115413.
 * @author Sean A. Irvine
 */
public class A115413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115413() {
    super(new long[] {1, -1, -1, 1, 0}, new long[] {-1, 1, -1, 2, -1});
  }
}
