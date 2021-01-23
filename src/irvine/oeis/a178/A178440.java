package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178440 Convolution square of A058187, the tetrahedral series with repeats.
 * @author Sean A. Irvine
 */
public class A178440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178440() {
    super(new long[] {-1, 2, 5, -12, -9, 30, 5, -40, 5, 30, -9, -12, 5, 2}, new long[] {1, 2, 9, 16, 44, 72, 156, 240, 450, 660, 1122, 1584, 2508, 3432});
  }
}
