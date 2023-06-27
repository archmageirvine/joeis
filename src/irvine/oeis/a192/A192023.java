package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192023 The Wiener index of the comb-shaped graph |_|_|...|_| with 2n (n&gt;=1) nodes. The Wiener index of a connected graph is the sum of the distances between all unordered pairs of vertices in the graph.
 * @author Sean A. Irvine
 */
public class A192023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192023() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 10, 31, 68});
  }
}
