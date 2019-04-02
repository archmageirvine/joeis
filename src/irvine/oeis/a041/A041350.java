package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041350 Numerators of continued fraction convergents to sqrt(189).
 * @author Sean A. Irvine
 */
public class A041350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041350() {
    super(new long[] {-1, 0, 0, 0, 110, 0, 0, 0}, new long[] {13, 14, 41, 55, 1471, 1526, 4523, 6049});
  }
}
