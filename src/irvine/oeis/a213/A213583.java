package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213583 Principal diagonal of the convolution array A213582.
 * @author Sean A. Irvine
 */
public class A213583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213583() {
    super(new long[] {4, -16, 25, -19, 7}, new long[] {1, 9, 38, 120, 327});
  }
}
