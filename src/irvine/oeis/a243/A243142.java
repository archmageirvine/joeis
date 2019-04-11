package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243142 Number of inequivalent <code>(mod</code> D_3) ways to place 3 points on a triangular grid of side n so that they are not vertices of an equilateral triangle of any orientation.
 * @author Sean A. Irvine
 */
public class A243142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243142() {
    super(new long[] {1, -4, 3, 8, -14, 0, 14, -8, -3, 4}, new long[] {0, 3, 19, 75, 218, 542, 1178, 2350, 4340, 7585});
  }
}
