package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288958 Number of cliques in the n X n rook graph.
 * @author Sean A. Irvine
 */
public class A288958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288958() {
    super(1, new long[] {4, -16, 25, -19, 7}, new long[] {2, 9, 34, 105, 286});
  }
}
