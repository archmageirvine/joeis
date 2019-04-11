package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041256 Numerators of continued fraction convergents to <code>sqrt(140)</code>.
 * @author Sean A. Irvine
 */
public class A041256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041256() {
    super(new long[] {-1, 0, 0, 0, 142, 0, 0, 0}, new long[] {11, 12, 59, 71, 1621, 1692, 8389, 10081});
  }
}
