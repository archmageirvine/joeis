package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003765 Number of Hamiltonian cycles in W_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003765() {
    super(new long[]{0, -4, 20, -19, 3, 5},
      new long[]{1, 10, 46, 238, 1170, 5882}
    );
  }
}
