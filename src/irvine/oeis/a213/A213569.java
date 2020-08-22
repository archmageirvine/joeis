package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213569 Principal diagonal of the convolution array A213568.
 * @author Sean A. Irvine
 */
public class A213569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213569() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 7, 25, 71});
  }
}
