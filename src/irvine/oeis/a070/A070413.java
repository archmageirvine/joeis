package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070413.
 * @author Sean A. Irvine
 */
public class A070413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070413() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {1, 7, 20, 24, 23, 16, 25});
  }
}
