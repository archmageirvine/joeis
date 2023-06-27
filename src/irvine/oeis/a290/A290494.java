package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290494 Number of irredundant sets in the n-wheel graph.
 * @author Sean A. Irvine
 */
public class A290494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290494() {
    super(4, new long[] {1, -1, -1, 1, -1, 0, 2}, new long[] {5, 12, 17, 25, 44, 76, 131});
  }
}
