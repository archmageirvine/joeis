package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117413.
 * @author Sean A. Irvine
 */
public class A117413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117413() {
    super(new long[] {-1, -4, 2, 0}, new long[] {1, 0, 1, -4});
  }
}
