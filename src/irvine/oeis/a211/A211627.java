package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211627.
 * @author Sean A. Irvine
 */
public class A211627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211627() {
    super(new long[] {-1, 2, -1, 0, 0, 2, -4, 2, 0, 0, -1, 2}, new long[] {0, 4, 32, 108, 256, 492, 854, 1360, 2034, 2900, 3965, 5285});
  }
}
