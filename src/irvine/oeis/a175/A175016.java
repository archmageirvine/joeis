package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175016 y-values in the solution to x^2-58*y^2=1.
 * @author Sean A. Irvine
 */
public class A175016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175016() {
    super(1, new long[] {-1, 39206}, new long[] {0, 2574});
  }
}
