package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226348 Number of ways to tile a fixed 3 x n square grid with 1 x 1, 2 x 2, and axially-oriented 1 x 2 tiles.
 * @author Sean A. Irvine
 */
public class A226348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226348() {
    super(new long[] {6, 5, -26, -1, 15, 2}, new long[] {1, 12, 39, 233, 1018, 5191});
  }
}
