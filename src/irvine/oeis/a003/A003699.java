package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003699 Number of Hamiltonian cycles in <code>C_4 X P_n</code>.
 * @author Sean A. Irvine
 */
public class A003699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003699() {
    super(new long[] {0, -1, 4}, new long[] {1, 6, 22});
  }
}
