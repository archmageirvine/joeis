package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260585.
 * @author Sean A. Irvine
 */
public class A260585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260585() {
    super(new long[] {20, -100, 209, -236, 155, -59, 12}, new long[] {1, 11, 72, 367, 1630, 6680, 26082});
  }
}
