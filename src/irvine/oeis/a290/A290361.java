package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290361 Number of 7-leaf rooted trees with n levels.
 * @author Sean A. Irvine
 */
public class A290361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290361() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 15, 111, 518, 1789, 5026});
  }
}
