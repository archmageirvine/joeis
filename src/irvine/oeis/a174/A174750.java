package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174750 x-values in the solution to x^2-38*y^2=1.
 * @author Sean A. Irvine
 */
public class A174750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174750() {
    super(new long[] {-1, 74}, new long[] {1, 37});
  }
}
