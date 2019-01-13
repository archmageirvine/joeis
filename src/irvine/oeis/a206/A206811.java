package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206811.
 * @author Sean A. Irvine
 */
public class A206811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206811() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {15, 160, 830, 2976, 8477, 20608, 44604});
  }
}
