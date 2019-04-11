package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006865 Number of Hamiltonian cycles in P_5 X P_{2n}: <code>a(n) = 11a(n-1)+2a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A006865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006865() {
    super(new long[] {2, 0, 11}, new long[] {1, 14, 154});
  }
}

