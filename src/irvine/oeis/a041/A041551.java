package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041551 Denominators of continued fraction convergents to <code>sqrt(293)</code>.
 * @author Sean A. Irvine
 */
public class A041551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041551() {
    super(new long[] {1, 0, 0, 0, 0, 4964, 0, 0, 0, 0}, new long[] {1, 8, 9, 17, 145, 4947, 39721, 44668, 84389, 719780});
  }
}
