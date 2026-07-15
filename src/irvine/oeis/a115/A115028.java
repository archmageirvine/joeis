package irvine.oeis.a115;

import irvine.oeis.FiniteSequence;

/**
 * A115028 Table of 4 rows by 4 columns of parameters regarding triangles with perimeter 72. Column 0, 1 and 2 side length of triangles. Column 3: Squared area of the triangle. For details see the comments.
 * @author Sean A. Irvine
 */
public class A115028 extends FiniteSequence {

  /** Construct the sequence. */
  public A115028() {
    super(1, FINITE, 24, 24, 24, 62208, 24, 30, 18, 46656, 30, 24, 18, 46656, 30, 30, 12, 31104);
  }
}
