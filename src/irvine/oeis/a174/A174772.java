package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174772 y-values in the solution to x^2 - 33*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A174772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174772() {
    super(1, new long[] {-1, 46}, new long[] {0, 4});
  }
}
