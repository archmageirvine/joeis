package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212989.
 * @author Sean A. Irvine
 */
public class A212989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212989() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {1, 2, 3, 4, 9, 11, 13, 15, 24});
  }
}
