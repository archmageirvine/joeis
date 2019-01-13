package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158413.
 * @author Sean A. Irvine
 */
public class A158413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158413() {
    super(new long[] {1, -3, 3}, new long[] {963, 3848, 8655});
  }
}
