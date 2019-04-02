package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041497 Denominators of continued fraction convergents to sqrt(265).
 * @author Sean A. Irvine
 */
public class A041497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041497() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 12144, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 4, 7, 18, 43, 61, 104, 373, 12040, 36493, 48533, 85026, 218585, 522196, 740781, 1262977, 4529712});
  }
}
