package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174770 y-values in the solution to x^2 - 29*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A174770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174770() {
    super(1, new long[] {-1, 19602}, new long[] {0, 1820});
  }
}
