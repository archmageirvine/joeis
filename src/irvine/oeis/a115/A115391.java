package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115391.
 * @author Sean A. Irvine
 */
public class A115391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115391() {
    super(new long[] {-1, 2, -1, 0, 2, -4, 2, 0, -1, 2}, new long[] {1, 10, 14, 30, 55, 104, 140, 204, 285, 406});
  }
}
