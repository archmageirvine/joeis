package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041292 Numerators of continued fraction convergents to <code>sqrt(159)</code>.
 * @author Sean A. Irvine
 */
public class A041292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041292() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2648, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {12, 13, 25, 38, 63, 227, 290, 517, 807, 1324, 32583, 33907, 66490, 100397, 166887, 601058, 767945, 1369003, 2136948, 3505951});
  }
}
