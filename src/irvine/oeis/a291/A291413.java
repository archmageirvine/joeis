package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291413.
 * @author Sean A. Irvine
 */
public class A291413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291413() {
    super(new long[] {-1, -3, -4, -3, 2, 3}, new long[] {3, 11, 36, 117, 375, 1197});
  }
}
