package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041010 Numerators of continued fraction convergents to <code>sqrt(8)</code>.
 * @author Sean A. Irvine
 */
public class A041010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041010() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 2, 3, 14});
  }
}
