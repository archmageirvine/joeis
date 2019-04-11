package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240441 Number of ways to place 4 points on a triangular grid of side n so that no three of these points are vertices of <code>an</code> equilateral triangle of any orientation.
 * @author Sean A. Irvine
 */
public class A240441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240441() {
    super(new long[] {1, -7, 19, -21, -6, 42, -42, 6, 21, -19, 7}, new long[] {0, 0, 3, 114, 969, 4773, 17415, 52125, 135375, 315675, 676200});
  }
}
