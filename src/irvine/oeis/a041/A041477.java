package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041477 Denominators of continued fraction convergents to <code>sqrt(254)</code>.
 * @author Sean A. Irvine
 */
public class A041477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041477() {
    super(new long[] {-1, 0, 0, 0, 510, 0, 0, 0}, new long[] {1, 1, 15, 16, 495, 511, 7649, 8160});
  }
}
