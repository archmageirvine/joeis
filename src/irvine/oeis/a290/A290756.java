package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290756 Number of (non-null) connected induced subgraphs of the complete tripartite graph K_{n,n,n}.
 * @author Sean A. Irvine
 */
public class A290756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290756() {
    super(1, new long[] {-16, 42, -37, 12}, new long[] {7, 60, 499, 4062});
  }
}
