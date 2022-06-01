package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145411 Number of Hamiltonian cycles in K_6 X P_n.
 * @author Sean A. Irvine
 */
public class A145411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145411() {
    super(new long[] {-288, 516, 145}, new long[] {60, 12000, 1758360});
  }
}
