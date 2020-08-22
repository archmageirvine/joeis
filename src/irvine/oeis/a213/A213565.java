package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213565 Principal diagonal of the convolution array A213564.
 * @author Sean A. Irvine
 */
public class A213565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213565() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 21, 127, 467, 1302, 3038});
  }
}
