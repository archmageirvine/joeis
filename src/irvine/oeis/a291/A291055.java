package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291055 Number of maximal irredundant sets in the n-path graph.
 * @author Sean A. Irvine
 */
public class A291055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291055() {
    super(new long[] {-1, 0, 0, 1, 2, -1, -2, -1, 0, 1, 1, 1, 1, 0}, new long[] {1, 2, 2, 4, 6, 8, 13, 17, 27, 40, 57, 86, 122, 184});
  }
}
