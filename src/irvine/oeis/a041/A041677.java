package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041677 Denominators of continued fraction convergents to <code>sqrt(357)</code>.
 * @author Sean A. Irvine
 */
public class A041677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041677() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 6802, 0, 0, 0, 0, 0}, new long[] {1, 1, 9, 19, 161, 180, 6641, 6821, 61209, 129239, 1095121, 1224360});
  }
}
