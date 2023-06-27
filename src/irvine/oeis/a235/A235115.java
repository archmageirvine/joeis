package irvine.oeis.a235;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A235115 Number of independent vertex subsets of the graph obtained by attaching two pendant edges to each vertex of the star graph S_n (having n vertices; see A235114).
 * @author Sean A. Irvine
 */
public class A235115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235115() {
    super(1, new long[] {-20, 9}, new long[] {5, 24});
  }
}
