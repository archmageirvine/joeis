package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291444 Number of symmetric maximal irredundant sets in the n-path graph.
 * @author Sean A. Irvine
 */
public class A291444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291444() {
    super(1, new long[] {-1, 0, 0, 0, 0, 0, 1, 0, 2, 0, -1, 0, -2, 0, -1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0}, new long[] {1, 0, 2, 2, 2, 2, 3, 3, 5, 6, 7, 6, 10, 12, 15, 15, 22, 23, 33, 35, 48, 48, 71, 75, 103, 106, 152, 158});
  }
}
