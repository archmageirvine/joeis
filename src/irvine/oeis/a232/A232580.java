package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232580 Number of binary sequences of length n that contain at least one contiguous subsequence 011.
 * @author Sean A. Irvine
 */
public class A232580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232580() {
    super(new long[] {2, -1, -4, 4}, new long[] {0, 0, 0, 1});
  }
}
