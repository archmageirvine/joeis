package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174767 y-values in the solution to  x^2 - 23*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A174767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174767() {
    super(new long[] {-1, 48}, new long[] {0, 5});
  }
}
