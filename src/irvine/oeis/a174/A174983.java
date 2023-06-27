package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174983 y-values in the solution to x^2-53*y^2=1.
 * @author Sean A. Irvine
 */
public class A174983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174983() {
    super(1, new long[] {-1, 132498}, new long[] {0, 9100});
  }
}
