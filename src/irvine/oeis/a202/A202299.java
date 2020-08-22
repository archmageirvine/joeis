package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202299 y-values in the solution to  x^2 - 18*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A202299 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202299() {
    super(new long[] {-1, 34}, new long[] {0, 4});
  }
}
