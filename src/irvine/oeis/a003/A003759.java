package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003759 Number of Hamiltonian cycles in D_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003759() {
    super(1, new long[]{1, -2, 3, 3}, new long[]{0, 2, 6, 24});
  }
}
