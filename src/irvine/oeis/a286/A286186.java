package irvine.oeis.a286;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A286186 Number of connected induced (non-null) subgraphs of the friendship graph with 2n+1 nodes.
 * @author Sean A. Irvine
 */
public class A286186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286186() {
    super(1, new long[] {4, -9, 6}, new long[] {7, 22, 73});
  }
}
