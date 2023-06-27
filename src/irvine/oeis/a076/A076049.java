package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076049 Numbers k such that the sum of the k-th triangular number and (k+2)-nd triangular number is a triangular number.
 * @author Sean A. Irvine
 */
public class A076049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076049() {
    super(1, new long[] {1, -1, -6, 6, 1}, new long[] {0, 3, 8, 25, 54});
  }
}
