package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290893 p-INVERT of the positive integers, where p(S) = 1 - S^5.
 * @author Sean A. Irvine
 */
public class A290893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290893() {
    super(new long[] {-1, 10, -45, 120, -210, 253, -210, 120, -45, 10}, new long[] {0, 0, 0, 0, 1, 10, 55, 220, 715, 2003});
  }
}
