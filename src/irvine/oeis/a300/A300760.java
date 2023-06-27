package irvine.oeis.a300;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A300760 Number of ways to select 4 numbers from the set of the first n natural numbers avoiding 3-term arithmetic progressions.
 * @author Sean A. Irvine
 */
public class A300760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A300760() {
    super(4, new long[] {1, -2, 0, 1, 0, 2, -2, 0, -1, 0, 2}, new long[] {0, 1, 4, 10, 25, 51, 98, 165, 267, 407, 601});
  }
}
