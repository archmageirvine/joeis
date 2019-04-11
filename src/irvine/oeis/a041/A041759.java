package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041759 Denominators of continued fraction convergents to <code>sqrt(399)</code>.
 * @author Sean A. Irvine
 */
public class A041759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041759() {
    super(new long[] {-1, 0, 40, 0}, new long[] {1, 1, 39, 40});
  }
}
