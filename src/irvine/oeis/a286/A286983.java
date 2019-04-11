package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286983 <code>a(n)</code> is the smallest integer that can appear as the n-th term of two distinct nondecreasing sequences of positive integers that satisfy the Fibonacci recurrence relation.
 * @author Sean A. Irvine
 */
public class A286983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286983() {
    super(new long[] {1, -1, -5, 1, 3}, new long[] {1, 2, 4, 9, 20});
  }
}
