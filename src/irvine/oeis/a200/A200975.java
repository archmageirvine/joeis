package irvine.oeis.a200;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A200975 Numbers on the diagonals in Ulam's spiral.
 * @author Sean A. Irvine
 */
public class A200975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200975() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {1, 3, 5, 7, 9, 13});
  }
}
