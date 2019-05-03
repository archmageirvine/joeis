package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160739 <code>16*P_6(n), 16</code> times the Legendre Polynomial of order 6 at n.
 * @author Sean A. Irvine
 */
public class A160739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160739() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {-5, 16, 10159, 143824, 867211, 3415120, 10373071});
  }
}
