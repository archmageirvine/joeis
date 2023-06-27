package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213549 Principal diagonal of the convolution array A213548.
 * @author Sean A. Irvine
 */
public class A213549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213549() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 12, 53, 155, 360});
  }
}
