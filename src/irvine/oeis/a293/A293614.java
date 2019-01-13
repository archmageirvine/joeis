package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293614.
 * @author Sean A. Irvine
 */
public class A293614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293614() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 26, 238, 1176, 4200, 12180, 30492, 68376});
  }
}
