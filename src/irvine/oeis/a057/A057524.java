package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057524 Number of 3 x n binary matrices without unit columns up to row and column permutations.
 * @author Sean A. Irvine
 */
public class A057524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057524() {
    super(new long[] {1, -3, 2, 1, 0, -1, -2, 3}, new long[] {1, 3, 7, 14, 25, 41, 64, 95});
  }
}
