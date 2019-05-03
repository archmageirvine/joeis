package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138976 The discriminant of the characteristic polynomial of the <code>O+</code> and <code>O-</code> submatrix for spin 3 of the nuclear electric quadrupole Hamiltonian is a perfect square for these values.
 * @author Sean A. Irvine
 */
public class A138976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138976() {
    super(new long[] {1, -1, -10, 10, 1}, new long[] {0, -3, -18, -45, -192});
  }
}
