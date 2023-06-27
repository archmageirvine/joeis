package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239568 Number of ways to place 2 points on a triangular grid of side n so that they are not adjacent.
 * @author Sean A. Irvine
 */
public class A239568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239568() {
    super(2, new long[] {1, -5, 10, -10, 5}, new long[] {0, 6, 27, 75, 165});
  }
}
