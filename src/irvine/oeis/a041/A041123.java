package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041123 Denominators of continued fraction convergents to <code>sqrt(70)</code>.
 * @author Sean A. Irvine
 */
public class A041123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041123() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 502, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 8, 11, 30, 491, 1012, 1503, 4018, 5521, 15060});
  }
}
