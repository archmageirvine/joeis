package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041600 Numerators of continued fraction convergents to <code>sqrt(318)</code>.
 * @author Sean A. Irvine
 */
public class A041600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041600() {
    super(new long[] {-1, 0, 0, 0, 214, 0, 0, 0}, new long[] {17, 18, 89, 107, 3727, 3834, 19063, 22897});
  }
}
