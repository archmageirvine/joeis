package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060885 <code>a(n) =</code> Sum_{j=0..10} <code>n^j</code>.
 * @author Sean A. Irvine
 */
public class A060885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060885() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 11, 2047, 88573, 1398101, 12207031, 72559411, 329554457, 1227133513, 3922632451L, 11111111111L});
  }
}
