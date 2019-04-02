package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172517 Number of ways to place 2 nonattacking queens on an n X n toroidal board.
 * @author Sean A. Irvine
 */
public class A172517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172517() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 0, 32, 100, 288, 588, 1152});
  }
}
