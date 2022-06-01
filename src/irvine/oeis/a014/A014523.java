package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014523 Number of Hamiltonian paths in a 4 X (2n+1) grid starting at the lower left corner and finishing in the upper right corner.
 * @author Sean A. Irvine
 */
public class A014523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014523() {
    super(new long[] {-1, 7, -9, 7}, new long[] {1, 4, 20, 111});
  }
}
