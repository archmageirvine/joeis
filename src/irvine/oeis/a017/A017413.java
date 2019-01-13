package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017413.
 * @author Sean A. Irvine
 */
public class A017413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017413() {
    super(new long[] {-1, 2}, new long[] {2, 13});
  }
}
