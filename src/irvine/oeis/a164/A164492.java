package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164492.
 * @author Sean A. Irvine
 */
public class A164492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164492() {
    super(new long[] {1, 0, 0, 1, 0, -1, 2}, new long[] {13, 21, 34, 56, 93, 155, 259});
  }
}
