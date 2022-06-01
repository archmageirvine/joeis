package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003771 Number of Hamiltonian cycles in K_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003771() {
    super(new long[]{0, -2, 7}, new long[]{3, 30, 198});
  }
}
