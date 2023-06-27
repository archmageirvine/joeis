package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291919 Number of (undirected) paths in the n-wheel graph.
 * @author Sean A. Irvine
 */
public class A291919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291919() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 9, 30, 78});
  }
}
