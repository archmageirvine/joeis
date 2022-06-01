package irvine.oeis.a034;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A034585 Dimension of an irreducible Z_2 graded H-module for Clifford algebra Cl_n.
 * @author Sean A. Irvine
 */
public class A034585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034585() {
    super(new long[] {16, 0, 0, 0, 0, 0, 0, 0}, new long[] {2, 2, 2, 2, 4, 8, 16, 16});
  }
}
