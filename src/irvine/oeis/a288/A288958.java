package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288958 Number of cliques in the <code>n X n</code> rook graph.
 * @author Sean A. Irvine
 */
public class A288958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288958() {
    super(new long[] {4, -16, 25, -19, 7}, new long[] {2, 9, 34, 105, 286});
  }
}
