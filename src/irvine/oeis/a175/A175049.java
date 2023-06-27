package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175049 y-values in the solution to x^2-59*y^2=1.
 * @author Sean A. Irvine
 */
public class A175049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175049() {
    super(1, new long[] {-1, 1060}, new long[] {0, 69});
  }
}
