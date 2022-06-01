package irvine.oeis.a034;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A034583 Dimension of an irreducible R-module for Clifford algebra Cl_n.
 * @author Sean A. Irvine
 */
public class A034583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034583() {
    super(new long[] {16, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 4, 4, 8, 8, 8, 8});
  }
}
