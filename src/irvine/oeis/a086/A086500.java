package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086500 Group the natural numbers such that the n-th group sum is divisible by the n-th triangular number: <code>(1), (2, 3, 4), (5, 6, 7), (8, 9, 10, 11, 12), (13, 14, 15, 16, 17), (18, 19, 20, 21, 22, 23, 24), ...</code> Sequence contains the group sum.
 * @author Sean A. Irvine
 */
public class A086500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086500() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 9, 18, 50, 75, 147, 196});
  }
}
