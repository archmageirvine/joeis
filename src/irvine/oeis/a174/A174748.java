package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174748 x-values in the solution to x^2-33*y^2=1.
 * @author Sean A. Irvine
 */
public class A174748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174748() {
    super(1, new long[] {-1, 46}, new long[] {1, 23});
  }
}
