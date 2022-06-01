package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213580 Principal diagonal of the convolution array A213579.
 * @author Sean A. Irvine
 */
public class A213580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213580() {
    super(new long[] {-1, 0, 4, -2, -4, 4}, new long[] {1, 5, 15, 35, 74, 146});
  }
}
