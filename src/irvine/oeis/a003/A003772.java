package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003772 Number of Hamiltonian paths in <code>K_4 X P_n</code>.
 * @author Sean A. Irvine
 */
public class A003772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003772() {
    super(new long[]{0, 24, -132, 62, 421, -173, 23},
      new long[]{12, 408, 6648, 90672, 1103088, 12509256, 135409896}
    );
  }
}
