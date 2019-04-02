package irvine.oeis.a296;

import irvine.oeis.LinearRecurrence;

/**
 * A296997 Number of ways to place 3 points on an n X n point grid so that no point is equally distant from two other points on the same row or the same column.
 * @author Sean A. Irvine
 */
public class A296997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A296997() {
    super(new long[] {1, -5, 8, 0, -14, 14, 0, -8, 5}, new long[] {0, 4, 78, 544, 2260, 7068, 18298, 41472, 85032});
  }
}
