package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243213.
 * @author Sean A. Irvine
 */
public class A243213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243213() {
    super(new long[] {1, -6, 12, -2, -27, 36, 0, -36, 27, 2, -12, 6}, new long[] {3, 128, 1062, 5160, 18591, 55113, 142005, 329045, 701160, 1395975, 2626953, 4713723});
  }
}
