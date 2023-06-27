package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188623 Number of reachable configurations in a chip-firing game on a triangle starting with n chips on one vertex.
 * @author Sean A. Irvine
 */
public class A188623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188623() {
    super(1, new long[] {1, -2, 1, -1, 2}, new long[] {1, 2, 2, 5, 7});
  }
}
