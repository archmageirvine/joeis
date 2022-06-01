package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291063 Number of maximal irredundant sets in the n-wheel graph.
 * @author Sean A. Irvine
 */
public class A291063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291063() {
    super(new long[] {1, -1, 0, -1, -1, 3, 1, -1, -1, -1, 0, 0, 0, 1, 1}, new long[] {1, 3, 4, 7, 11, 12, 15, 15, 31, 63, 67, 100, 144, 213, 344});
  }
}
