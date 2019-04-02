package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042723 Denominators of continued fraction convergents to sqrt(891).
 * @author Sean A. Irvine
 */
public class A042723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042723() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 7940, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 6, 7, 13, 20, 113, 133, 7827, 7960, 47627, 55587, 103214, 158801, 897219, 1056020});
  }
}
