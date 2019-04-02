package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053805 Expansion of (1 + x)^12 / (1 - x)^13.
 * @author Sean A. Irvine
 */
public class A053805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053805() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 25, 313, 2625, 16641, 85305, 369305, 1392065, 4673345, 14218905, 39753273, 103274625, 251595969});
  }
}
