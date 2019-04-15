package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228967 Table read by rows; <code>T(n,k) = 2n</code> for <code>k = 1, T(n,k) = 9n</code> for <code>k = 2</code>.
 * @author Sean A. Irvine
 */
public class A228967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228967() {
    super(new long[] {-1, 0, 2, 0}, new long[] {2, 9, 4, 18});
  }
}
