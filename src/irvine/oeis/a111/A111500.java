package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111500 Number of squares in an n X n grid of squares with diagonals.
 * @author Sean A. Irvine
 */
public class A111500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111500() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 10, 31, 72, 137});
  }
}
