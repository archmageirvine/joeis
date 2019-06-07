package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160743 <code>8*P_7(n), 8</code> times the Legendre Polynomial of order 7 at <code>n</code>.
 * @author Sean A. Irvine
 */
public class A160743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160743() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 8, 17593, 389112, 3169562, 15694600, 57385803, 170880248});
  }
}
