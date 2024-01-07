package irvine.oeis.a266;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A266464 Number of n X 2 binary arrays with rows and columns lexicographically nondecreasing and column sums nonincreasing.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A266464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266464() {
    super(0, new long[] {-1, 3, -2, -2, 3}, new long[] {1, 2, 4, 7, 12});
  }
}
