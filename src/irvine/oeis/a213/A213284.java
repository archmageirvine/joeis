package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213284.
 * @author Sean A. Irvine
 */
public class A213284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213284() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 14, 74, 276, 895});
  }
}
