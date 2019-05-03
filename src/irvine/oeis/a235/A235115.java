package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235115 Number of independent vertex subsets of the graph obtained by attaching two pendant edges to each vertex of the star graph <code>S_n</code> (having n vertices; see <code>A235114)</code>.
 * @author Sean A. Irvine
 */
public class A235115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235115() {
    super(new long[] {-20, 9}, new long[] {5, 24});
  }
}
