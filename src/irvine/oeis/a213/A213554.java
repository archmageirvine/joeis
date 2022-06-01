package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213554 Principal diagonal of the convolution array A213553.
 * @author Sean A. Irvine
 */
public class A213554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213554() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 43, 334, 1406, 4271, 10577});
  }
}
