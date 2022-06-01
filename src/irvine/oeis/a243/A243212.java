package irvine.oeis.a243;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A243212 Number of ways to place 3 points on a triangular grid of side n so that no three of them are vertices of an equilateral triangle with sides parallel to the grid.
 * @author Sean A. Irvine
 */
public class A243212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243212() {
    super(new long[] {1, -6, 14, -14, 0, 14, -14, 6}, new long[] {0, 15, 107, 428, 1282, 3198, 7022, 14020});
  }
}
