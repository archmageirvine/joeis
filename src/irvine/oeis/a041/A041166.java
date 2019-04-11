package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041166 Numerators of continued fraction convergents to <code>sqrt(93)</code>.
 * @author Sean A. Irvine
 */
public class A041166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041166() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 24302, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {9, 10, 19, 29, 135, 839, 3491, 4330, 7821, 12151, 226539, 238690, 465229, 703919, 3280905, 20389349, 84838301, 105227650, 190065951, 295293601});
  }
}
