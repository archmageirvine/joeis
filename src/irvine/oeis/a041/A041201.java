package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041201 Denominators of continued fraction convergents to <code>sqrt(111)</code>.
 * @author Sean A. Irvine
 */
public class A041201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041201() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 590, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 13, 15, 28, 575, 603, 1178, 7671, 8849, 16520});
  }
}
