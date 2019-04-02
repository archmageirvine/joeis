package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027927 Number of plane regions after drawing (in general position) a convex n-gon and all its diagonals.
 * @author Sean A. Irvine
 */
public class A027927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027927() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2, 5, 12, 26});
  }
}
