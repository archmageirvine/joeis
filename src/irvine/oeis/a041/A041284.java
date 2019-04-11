package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041284 Numerators of continued fraction convergents to <code>sqrt(155)</code>.
 * @author Sean A. Irvine
 */
public class A041284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041284() {
    super(new long[] {-1, 0, 0, 0, 498, 0, 0, 0}, new long[] {12, 25, 112, 249, 6088, 12425, 55788, 124001});
  }
}
