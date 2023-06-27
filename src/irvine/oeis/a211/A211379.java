package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211379 Number of pairs of parallel diagonals in a regular n-gon.
 * @author Sean A. Irvine
 */
public class A211379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211379() {
    super(3, new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 0, 0, 3, 7, 16});
  }
}
