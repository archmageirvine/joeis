package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041022 Numerators of continued fraction convergents to <code>sqrt(15)</code>.
 * @author Sean A. Irvine
 */
public class A041022 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041022() {
    super(new long[] {-1, 0, 8, 0}, new long[] {3, 4, 27, 31});
  }
}
