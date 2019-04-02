package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213848 Principal diagonal of the convolution array A213847.
 * @author Sean A. Irvine
 */
public class A213848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213848() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 36, 131, 320});
  }
}
