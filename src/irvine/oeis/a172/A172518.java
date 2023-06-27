package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172518 Number of ways to place 3 nonattacking queens on an n X n toroidal board.
 * @author Sean A. Irvine
 */
public class A172518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172518() {
    super(1, new long[] {1, -2, -4, 10, 5, -20, 0, 20, -5, -10, 4, 2}, new long[] {0, 0, 0, 0, 100, 576, 2156, 7168, 17496, 41600, 82280, 161280});
  }
}
