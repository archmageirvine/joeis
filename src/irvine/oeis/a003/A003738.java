package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003738 Number of Hamiltonian paths in W_5 X P_n.
 * @author Sean A. Irvine
 */
public class A003738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003738() {
    super(new long[] {0, -56832, -3328, -128, 60},
      new long[] {24, 1920, 70184, 2154592, 58772296}
    );
  }
}
