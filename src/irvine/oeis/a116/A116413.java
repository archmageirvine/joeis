package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116413.
 * @author Sean A. Irvine
 */
public class A116413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116413() {
    super(new long[] {1, 1, 2}, new long[] {1, 3, 7});
  }
}
