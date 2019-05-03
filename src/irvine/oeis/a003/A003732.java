package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003732 Number of Hamiltonian paths in <code>C_5 X P_n</code>.
 * @author Sean A. Irvine
 */
public class A003732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003732() {
    super(new long[] {0, 0, -20, 68, -140, 12, 380, -1016, 1127, -675, -117, 328, -127, 19},
      new long[] {5, 130, 1660, 16820, 152230, 1275680, 10154290, 77897010, 581452680, 4250594690L, 30572999140L, 217099260110L, 1525905283670L, 10636695448300L}
    );
  }
}
