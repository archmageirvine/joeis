package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041619 Denominators of continued fraction convergents to sqrt(328).
 * @author Sean A. Irvine
 */
public class A041619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041619() {
    super(new long[] {-1, 0, 326, 0}, new long[] {1, 9, 325, 2934});
  }
}
