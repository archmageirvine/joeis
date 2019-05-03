package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290756 Number of <code>(non-null)</code> connected induced subgraphs of the complete tripartite graph <code>K_{n,n,n}</code>.
 * @author Sean A. Irvine
 */
public class A290756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290756() {
    super(new long[] {-16, 42, -37, 12}, new long[] {7, 60, 499, 4062});
  }
}
