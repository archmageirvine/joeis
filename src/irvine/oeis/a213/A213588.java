package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213588 Principal diagonal of the convolution array A213587.
 * @author Sean A. Irvine
 */
public class A213588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213588() {
    super(1, new long[] {-1, 5, -5, -5, 5}, new long[] {1, 7, 27, 96, 315});
  }
}
