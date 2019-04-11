package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041486 Numerators of continued fraction convergents to <code>sqrt(260)</code>.
 * @author Sean A. Irvine
 */
public class A041486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041486() {
    super(new long[] {-1, 0, 258, 0}, new long[] {16, 129, 4144, 33281});
  }
}
