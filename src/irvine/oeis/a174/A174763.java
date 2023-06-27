package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174763 x-values in the solution to x^2-62*y^2=1.
 * @author Sean A. Irvine
 */
public class A174763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174763() {
    super(1, new long[] {-1, 126}, new long[] {1, 63});
  }
}
