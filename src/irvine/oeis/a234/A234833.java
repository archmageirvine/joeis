package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234833 Number of tilings of a box with sides 2 X 2 X <code>3n</code> in R^3 by boxes of sides Tricube-V(3-dimensional dominoes).
 * @author Sean A. Irvine
 */
public class A234833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234833() {
    super(new long[] {-192, 68}, new long[] {1, 44});
  }
}
