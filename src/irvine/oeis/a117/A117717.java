package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117717 Maximal number of regions obtained by a straight line drawing of the complete bipartite graph K_{n,n}.
 * @author Sean A. Irvine
 */
public class A117717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117717() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 2, 13, 45, 116});
  }
}
