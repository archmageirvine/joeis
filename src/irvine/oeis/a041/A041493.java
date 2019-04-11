package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041493 Denominators of continued fraction convergents to <code>sqrt(263)</code>.
 * @author Sean A. Irvine
 */
public class A041493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041493() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 278256, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 4, 5, 9, 14, 23, 359, 382, 741, 1123, 1864, 8579, 276392, 1114147, 1390539, 2504686, 3895225, 6399911, 99893890, 106293801, 206187691, 312481492, 518669183, 2387158224L});
  }
}
