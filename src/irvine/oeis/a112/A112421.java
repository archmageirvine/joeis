package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112421 Number of 6 element subsets of <code>{1,2,3,</code>...,n} for which the sum-set has 12 elements.
 * @author Sean A. Irvine
 */
public class A112421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112421() {
    super(new long[] {1, -2, 1, 0, 0, 0, -1, 2}, new long[] {2, 4, 6, 8, 10, 12, 16, 20});
  }
}
