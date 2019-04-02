package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041167 Denominators of continued fraction convergents to sqrt(93).
 * @author Sean A. Irvine
 */
public class A041167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041167() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 24302, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 14, 87, 362, 449, 811, 1260, 23491, 24751, 48242, 72993, 340214, 2114277, 8797322, 10911599, 19708921, 30620520});
  }
}
