package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292000 Number of (undirected) paths in the n-gear graph.
 * @author Sean A. Irvine
 */
public class A292000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292000() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {5, 33, 117, 322, 745});
  }
}
