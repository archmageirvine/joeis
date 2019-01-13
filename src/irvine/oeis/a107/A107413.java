package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107413.
 * @author Sean A. Irvine
 */
public class A107413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107413() {
    super(new long[] {1, 0, -6, 0, 7}, new long[] {0, 1, 1, 2, 3});
  }
}
