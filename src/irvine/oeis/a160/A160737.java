package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160737 4*P_5(n), 4 times the Legendre Polynomial of order 5 at n.
 * @author Sean A. Irvine
 */
public class A160737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160737() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 4, 743, 6732, 30046, 94100});
  }
}
