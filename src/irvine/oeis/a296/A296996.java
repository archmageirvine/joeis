package irvine.oeis.a296;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A296996 Number of nonequivalent (mod D_8) ways to place 3 points on an n X n point grid so that no point is equally distant from two other points on the same row or the same column.
 * @author Sean A. Irvine
 */
public class A296996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A296996() {
    super(1, new long[] {1, -3, -1, 11, -6, -14, 14, 6, -11, 1, 3}, new long[] {0, 1, 14, 75, 310, 911, 2373, 5254, 10824, 20305, 36300});
  }
}
