package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041750 Numerators of continued fraction convergents to <code>sqrt(395)</code>.
 * @author Sean A. Irvine
 */
public class A041750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041750() {
    super(new long[] {-1, 0, 0, 0, 318, 0, 0, 0}, new long[] {19, 20, 139, 159, 6181, 6340, 44221, 50561});
  }
}
