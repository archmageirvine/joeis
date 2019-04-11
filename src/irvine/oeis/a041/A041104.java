package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041104 Numerators of continued fraction convergents to <code>sqrt(60)</code>.
 * @author Sean A. Irvine
 */
public class A041104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041104() {
    super(new long[] {-1, 0, 0, 0, 62, 0, 0, 0}, new long[] {7, 8, 23, 31, 457, 488, 1433, 1921});
  }
}
