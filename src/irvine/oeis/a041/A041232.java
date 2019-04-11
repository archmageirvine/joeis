package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041232 Numerators of continued fraction convergents to <code>sqrt(128)</code>.
 * @author Sean A. Irvine
 */
public class A041232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041232() {
    super(new long[] {-1, 0, 0, 0, 1154, 0, 0, 0}, new long[] {11, 34, 181, 577, 12875, 39202, 208885, 665857});
  }
}
