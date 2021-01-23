package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213556 Principal diagonal of the convolution array A213555.
 * @author Sean A. Irvine
 */
public class A213556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213556() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 19, 118, 446, 1271, 3017});
  }
}
