package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041975 Denominators of continued fraction convergents to sqrt(510).
 * @author Sean A. Irvine
 */
public class A041975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041975() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 542, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 5, 7, 12, 535, 547, 1082, 2711, 3793, 6504});
  }
}
