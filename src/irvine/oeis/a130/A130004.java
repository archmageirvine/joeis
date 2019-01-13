package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130004.
 * @author Sean A. Irvine
 */
public class A130004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130004() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 31, 1204, 1347, 1504, 8151, 8980});
  }
}
