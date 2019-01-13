package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055329.
 * @author Sean A. Irvine
 */
public class A055329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055329() {
    super(new long[] {1, -3, 1, 4, -3, 1, -3, 0, 3, -1, 3, -4, -1, 3}, new long[] {2, 11, 40, 109, 254, 524, 998, 1774, 2995, 4833, 7525, 11346, 16659, 23877});
  }
}
