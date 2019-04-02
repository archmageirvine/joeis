package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090020 Number of distinct lines through the origin in the n-dimensional lattice of side length 4.
 * @author Sean A. Irvine
 */
public class A090020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090020() {
    super(new long[] {-30, 61, -41, 11}, new long[] {0, 1, 13, 91});
  }
}
