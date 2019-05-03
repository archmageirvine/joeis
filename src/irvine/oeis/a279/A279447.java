package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279447 Number of nonequivalent ways to place 3 points on an <code>n X n</code> square grid so that no more than 2 points are on a vertical or horizontal straight line.
 * @author Sean A. Irvine
 */
public class A279447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279447() {
    super(new long[] {1, -3, -1, 11, -6, -14, 14, 6, -11, 1, 3}, new long[] {0, 1, 14, 73, 301, 890, 2321, 5166, 10654, 20055, 35880});
  }
}
