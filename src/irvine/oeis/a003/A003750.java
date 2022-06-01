package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003750 Number of Hamiltonian paths in K_5 X P_n.
 * @author Sean A. Irvine
 */
public class A003750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003750() {
    super(new long[]{0, -6912, -19296, 29616, 97152, 23880, -2854, 95},
      new long[] {60, 8760, 617400, 36021240, 1871009400, 90539967480L, 4181860331640L, 187073020183800L}
    );
  }
}
