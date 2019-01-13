package irvine.oeis.a207;

import irvine.oeis.LinearRecurrence;

/**
 * A207061.
 * @author Sean A. Irvine
 */
public class A207061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207061() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 92, 935, 1299, 1775, 6552, 8660});
  }
}
