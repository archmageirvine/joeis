package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213663 Number of dominating subsets of the graph G(n) obtained by joining each vertex of the path graph P_{n+1} on n+1 vertices with an additional vertex (the join of K_1 and P_{n+1}).
 * @author Sean A. Irvine
 */
public class A213663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213663() {
    super(new long[] {-2, -1, -1, 3}, new long[] {7, 13, 25, 49});
  }
}
