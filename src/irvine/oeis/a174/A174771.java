package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174771 y-values in the solution to x^2 - 31*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A174771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174771() {
    super(new long[] {-1, 3040}, new long[] {0, 273});
  }
}
