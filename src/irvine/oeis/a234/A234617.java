package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234617 Numbers of undirected cycles in the 2n-crossed prism graph.
 * @author Sean A. Irvine
 */
public class A234617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234617() {
    super(new long[] {16, -52, 64, -37, 10}, new long[] {6, 28, 107, 380, 1345});
  }
}
