package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090021 Number of distinct lines through the origin in the n-dimensional lattice of side length 5.
 * @author Sean A. Irvine
 */
public class A090021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090021() {
    super(new long[] {-36, 72, -47, 12}, new long[] {0, 1, 21, 175});
  }
}
