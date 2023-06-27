package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164492 Number of binary strings of length n with no substrings equal to 0010 0101 or 0110.
 * @author Sean A. Irvine
 */
public class A164492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164492() {
    super(4, new long[] {1, 0, 0, 1, 0, -1, 2}, new long[] {13, 21, 34, 56, 93, 155, 259});
  }
}
