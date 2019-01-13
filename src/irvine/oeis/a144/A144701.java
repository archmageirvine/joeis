package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144701.
 * @author Sean A. Irvine
 */
public class A144701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144701() {
    super(new long[] {-1, -4, -10, -16, -19, -16, -10, -4}, new long[] {1, -9, 26, -25, -36, 133, -132, -81});
  }
}
