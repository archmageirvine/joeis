package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060885 <code>a(n) = n^10 + n^9 + n^8 + n^7 + n^6 + n^5 + n^4 + n^3 + n^2 + n + 1</code>.
 * @author Sean A. Irvine
 */
public class A060885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060885() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 11, 2047, 88573, 1398101, 12207031, 72559411, 329554457, 1227133513, 3922632451L, 11111111111L});
  }
}
