package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213820 Principal diagonal of the convolution array A213819.
 * @author Sean A. Irvine
 */
public class A213820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213820() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {2, 18, 60, 140});
  }
}
