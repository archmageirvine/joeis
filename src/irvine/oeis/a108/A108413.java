package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108413.
 * @author Sean A. Irvine
 */
public class A108413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108413() {
    super(new long[] {-1, 0, -4, 0}, new long[] {1, 1, 1, -2});
  }
}
