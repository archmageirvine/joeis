package irvine.oeis.a242;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A242771 Number of integer points in a certain quadrilateral scaled by a factor of n (another version).
 * @author Sean A. Irvine
 */
public class A242771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242771() {
    super(1, new long[] {1, -1, -1, 0, 1, 1}, new long[] {0, 0, 1, 3, 6, 9});
  }
}
