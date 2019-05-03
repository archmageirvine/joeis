package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213567 Principal diagonal of the convolution array <code>A213566</code>.
 * @author Sean A. Irvine
 */
public class A213567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213567() {
    super(new long[] {-1, 0, 6, -3, -12, 12, 5, -12, 6}, new long[] {1, 13, 59, 183, 476, 1108, 2409, 4993, 10007});
  }
}
