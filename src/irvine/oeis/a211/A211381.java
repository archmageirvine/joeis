package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211381 Number of pairs of intersecting diagonals in the exterior of a regular n-gon.
 * @author Sean A. Irvine
 */
public class A211381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211381() {
    super(3, new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 0, 0, 0, 7, 24, 63});
  }
}
