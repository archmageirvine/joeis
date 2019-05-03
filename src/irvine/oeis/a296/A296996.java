package irvine.oeis.a296;

import irvine.oeis.LinearRecurrence;

/**
 * A296996 Number of nonequivalent <code>(mod D_8)</code> ways to place 3 points on an <code>n X n</code> point grid so that no point is equally distant from two other points on the same row or the same column.
 * @author Sean A. Irvine
 */
public class A296996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A296996() {
    super(new long[] {1, -3, -1, 11, -6, -14, 14, 6, -11, 1, 3}, new long[] {0, 1, 14, 75, 310, 911, 2373, 5254, 10824, 20305, 36300});
  }
}
