package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239571 Number of ways to place 5 points on a triangular grid of side n so that no two of them are adjacent.
 * @author Sean A. Irvine
 */
public class A239571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239571() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 0, 27, 999, 11565, 74811, 342042, 1239525, 3799488, 10259640, 25076952});
  }
}
