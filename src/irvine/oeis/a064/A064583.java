package irvine.oeis.a064;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A064583 a(n) = n^4*(n^4+1)*(n^2-1).
 * @author Sean A. Irvine
 */
public class A064583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064583() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 0, 816, 53136, 986880, 9390000, 58831920, 276825696, 1057222656, 3444262560L, 9900990000L});
  }
}
