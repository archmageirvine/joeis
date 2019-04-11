package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041589 Denominators of continued fraction convergents to <code>sqrt(312)</code>.
 * @author Sean A. Irvine
 */
public class A041589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041589() {
    super(new long[] {-1, 0, 0, 0, 106, 0, 0, 0}, new long[] {1, 1, 2, 3, 104, 107, 211, 318});
  }
}
