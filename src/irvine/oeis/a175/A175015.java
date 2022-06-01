package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175015 y-values in the solution to x^2-57*y^2=1.
 * @author Sean A. Irvine
 */
public class A175015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175015() {
    super(new long[] {-1, 302}, new long[] {0, 20});
  }
}
