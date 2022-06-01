package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176368 x-values in the solution to x^2 - 65*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A176368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176368() {
    super(new long[] {-1, 258}, new long[] {1, 129});
  }
}
