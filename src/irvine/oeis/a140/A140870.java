package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140870 8*P_4(2n), 8 times the Legendre Polynomial of order 4 at 2n.
 * @author Sean A. Irvine
 */
public class A140870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140870() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {3, 443, 8483, 44283, 141443});
  }
}
