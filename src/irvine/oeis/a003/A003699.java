package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003699 Number of Hamiltonian cycles in C_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003699() {
    super(new long[] {0, -1, 4}, new long[] {1, 6, 22});
  }
}
