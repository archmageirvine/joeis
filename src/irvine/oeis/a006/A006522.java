package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006522 4-dimensional analog of centered polygonal numbers. Also number of regions created by sides and diagonals of a convex n-gon in general position.
 * @author Sean A. Irvine
 */
public class A006522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006522() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 0, 0, 1, 4});
  }
}
