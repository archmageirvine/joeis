package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006865 Number of Hamiltonian cycles in P_5 X P_{2n}: a(n) = 11*a(n-1) + 2*a(n-3).
 * @author Sean A. Irvine
 */
public class A006865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006865() {
    super(1, new long[] {2, 0, 11}, new long[] {1, 14, 154});
  }
}

