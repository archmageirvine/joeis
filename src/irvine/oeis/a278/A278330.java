package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278330 Number of tilings of a <code>5 X n</code> rectangle using n pentominoes of shapes P, U, X.
 * @author Sean A. Irvine
 */
public class A278330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278330() {
    super(new long[] {-8, -16, 0, -6, -4, -8, 21, 4, 8, 2, 2, 0}, new long[] {1, 0, 2, 1, 12, 10, 59, 52, 276, 349, 1404, 1984});
  }
}
