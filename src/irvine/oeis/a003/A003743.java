package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003743 Number of Hamiltonian cycles in O_5 X P_n.
 * @author Sean A. Irvine
 */
public class A003743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003743() {
    super(new long[]{0, 256, 432, -460, 136, 16},
      new long[]{6, 204, 4152, 90012, 1916640, 41086080}
    );
  }
}
