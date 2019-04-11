package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041758 Numerators of continued fraction convergents to <code>sqrt(399)</code>.
 * @author Sean A. Irvine
 */
public class A041758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041758() {
    super(new long[] {-1, 0, 40, 0}, new long[] {19, 20, 779, 799});
  }
}
