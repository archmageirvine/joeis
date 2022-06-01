package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213769 Principal diagonal of the convolution array A213768.
 * @author Sean A. Irvine
 */
public class A213769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213769() {
    super(new long[] {-1, 0, 4, -2, -4, 4}, new long[] {1, 8, 26, 63, 136, 272});
  }
}
