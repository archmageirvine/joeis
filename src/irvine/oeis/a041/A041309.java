package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041309 Denominators of continued fraction convergents to <code>sqrt(167)</code>.
 * @author Sean A. Irvine
 */
public class A041309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041309() {
    super(new long[] {-1, 0, 0, 0, 336, 0, 0, 0}, new long[] {1, 1, 12, 13, 324, 337, 4031, 4368});
  }
}
