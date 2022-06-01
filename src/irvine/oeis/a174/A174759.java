package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174759 x-values in the solution to x^2-57*y^2=1.
 * @author Sean A. Irvine
 */
public class A174759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174759() {
    super(new long[] {-1, 302}, new long[] {1, 151});
  }
}
