package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145401 Number of Hamiltonian cycles in P_6 X P_n.
 * @author Sean A. Irvine
 */
public class A145401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145401() {
    super(1, new long[] {2, -4, 28, 42, -82, -8, 118, -66, -35, 90, 12, -63, 14, 5}, new long[] {0, 1, 4, 37, 154, 1072, 5320, 32675, 175294, 1024028, 5668692, 32463802, 181971848, 1033917350});
  }
}
