package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206811 Sum_{0&lt;j&lt;k&lt;=n} <code>(k^4-j^4)</code>.
 * @author Sean A. Irvine
 */
public class A206811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206811() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {15, 160, 830, 2976, 8477, 20608, 44604});
  }
}
