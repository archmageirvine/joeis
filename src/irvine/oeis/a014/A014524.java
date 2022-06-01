package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014524 Number of Hamiltonian paths from NW to SW corners in a grid with 2n rows and 4 columns.
 * @author Sean A. Irvine
 */
public class A014524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014524() {
    super(new long[] {-1, 7, -9, 7}, new long[] {0, 1, 8, 47});
  }
}
