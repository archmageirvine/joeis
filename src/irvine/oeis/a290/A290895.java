package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290895 p-INVERT of the positive integers, where p(S) = 1 - S^7.
 * @author Sean A. Irvine
 */
public class A290895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290895() {
    super(new long[] {-1, 14, -91, 364, -1001, 2002, -3003, 3433, -3003, 2002, -1001, 364, -91, 14}, new long[] {0, 0, 0, 0, 0, 0, 1, 14, 105, 560, 2380, 8568, 27132, 77521});
  }
}
