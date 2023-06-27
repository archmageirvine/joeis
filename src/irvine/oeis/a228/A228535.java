package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228535 x-values in the solution to the Pell equation x^2 - 53*y^2 = -1.
 * @author Sean A. Irvine
 */
public class A228535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228535() {
    super(1, new long[] {-1, 132498}, new long[] {182, 24114818});
  }
}
