package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115264.
 * @author Sean A. Irvine
 */
public class A115264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115264() {
    super(new long[] {1, -1, -2, 1, 1, 2, 0, -2, -1, -1, 2, 1}, new long[] {1, 1, 3, 4, 8, 10, 17, 21, 32, 39, 55, 66});
  }
}
