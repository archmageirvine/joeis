package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213832 Principal diagonal of the convolution array A213831.
 * @author Sean A. Irvine
 */
public class A213832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213832() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 19, 78, 202});
  }
}
