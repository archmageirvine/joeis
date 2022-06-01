package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174871 Numbers k such that the k-th triangular number ends in 6 or 8.
 * @author Sean A. Irvine
 */
public class A174871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174871() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {3, 7, 8, 11, 12, 16, 23});
  }
}
