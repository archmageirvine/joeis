package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213663 Number of dominating subsets of the graph <code>G(n)</code> obtained by joining each vertex of the path graph <code>P_{n+1}</code> on <code>n+1</code> vertices with an additional vertex (the join of <code>K_1</code> and <code>P_{n+1})</code>.
 * @author Sean A. Irvine
 */
public class A213663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213663() {
    super(new long[] {-2, -1, -1, 3}, new long[] {7, 13, 25, 49});
  }
}
