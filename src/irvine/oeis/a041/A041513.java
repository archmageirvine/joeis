package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041513 Denominators of continued fraction convergents to <code>sqrt(273)</code>.
 * @author Sean A. Irvine
 */
public class A041513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041513() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1454, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 21, 23, 44, 1431, 1475, 2906, 30535, 33441, 63976});
  }
}
