package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041058 Numerators of continued fraction convergents to <code>sqrt(35)</code>.
 * @author Sean A. Irvine
 */
public class A041058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041058() {
    super(new long[] {-1, 0, 12, 0}, new long[] {5, 6, 65, 71});
  }
}
