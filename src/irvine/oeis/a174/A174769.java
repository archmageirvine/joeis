package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174769 x-values in the solution to x^2 - 29*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A174769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174769() {
    super(new long[] {-1, 19602}, new long[] {1, 9801});
  }
}
