package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111889 A repeated permutation of {0,...,8}.
 * @author Sean A. Irvine
 */
public class A111889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111889() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 5, 3, 4, 8, 6, 7, 2});
  }
}
