package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160864 64*P_9(n), 64 times the Legendre polynomial of order 9 at n.
 * @author Sean A. Irvine
 */
public class A160864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160864() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 64, 1734443, 93604032, 1391396086, 10892513600L, 57713977089L, 234800671168L, 789011921132L, 2293521500736L});
  }
}
