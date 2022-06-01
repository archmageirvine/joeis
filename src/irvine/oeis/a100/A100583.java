package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100583 Number of triangles in an n X n grid of squares with diagonals.
 * @author Sean A. Irvine
 */
public class A100583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100583() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 8, 44, 124, 268});
  }
}
