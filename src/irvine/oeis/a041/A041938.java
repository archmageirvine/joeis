package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041938 Numerators of continued fraction convergents to <code>sqrt(492)</code>.
 * @author Sean A. Irvine
 */
public class A041938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041938() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 59534, 0, 0, 0, 0, 0, 0, 0}, new long[] {22, 111, 133, 244, 2573, 2817, 5390, 29767, 1315138, 6605457, 7920595, 14526052, 153181115, 167707167, 320888282, 1772148577});
  }
}
