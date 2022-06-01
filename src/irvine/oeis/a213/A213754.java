package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213754 Principal diagonal of the convolution array A213753.
 * @author Sean A. Irvine
 */
public class A213754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213754() {
    super(new long[] {-16, 68, -116, 101, -47, 11}, new long[] {1, 16, 111, 576, 2631, 11292});
  }
}
