package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003731 Number of Hamiltonian cycles in C_5 X P_n.
 * @author Sean A. Irvine
 */
public class A003731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003731() {
    super(new long[] {0, 2, -4, 6}, new long[] {1, 5, 30, 160});
  }
}
