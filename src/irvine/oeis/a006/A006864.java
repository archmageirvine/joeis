package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006864 Number of Hamiltonian cycles in P_4 X P_n.
 * @author Sean A. Irvine
 */
public class A006864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006864() {
    super(new long[] {1, -2, 2, 2}, new long[] {0, 1, 2, 6});
  }
}

