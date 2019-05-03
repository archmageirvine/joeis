package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234833 Number of tilings of a box with sides <code>2 X 2 X 3n</code> in <code>R^3</code> by boxes of sides <code>Tricube-V(3-dimensional dominoes)</code>.
 * @author Sean A. Irvine
 */
public class A234833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234833() {
    super(new long[] {-192, 68}, new long[] {1, 44});
  }
}
