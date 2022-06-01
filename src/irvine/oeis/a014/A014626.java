package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014626 Number of intersection points of diagonals of an n-gon in general position, plus number of vertices.
 * @author Sean A. Irvine
 */
public class A014626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014626() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 2, 3, 5});
  }
}
