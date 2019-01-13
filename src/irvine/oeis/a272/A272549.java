package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272549.
 * @author Sean A. Irvine
 */
public class A272549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272549() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {0, 1, 6, 3, 10, 15, 28, 21, 36});
  }
}
