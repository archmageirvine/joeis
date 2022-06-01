package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228547 y-values in the solution to the Pell equation x^2 - 74*y^2 = -1.
 * @author Sean A. Irvine
 */
public class A228547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228547() {
    super(new long[] {-1, 7398}, new long[] {5, 36985});
  }
}
