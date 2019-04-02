package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041341 Denominators of continued fraction convergents to sqrt(184).
 * @author Sean A. Irvine
 */
public class A041341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041341() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 48670, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 7, 16, 23, 62, 85, 232, 781, 1013, 1794, 47657, 49451, 97108, 340775, 778658, 1119433, 3017524, 4136957, 11291438, 38011271, 49302709, 87313980});
  }
}
