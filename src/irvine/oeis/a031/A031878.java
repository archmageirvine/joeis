package irvine.oeis.a031;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A031878 Maximal number of edges in Hamiltonian path in complete graph on n nodes.
 * @author Sean A. Irvine
 */
public class A031878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A031878() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 3, 5, 10});
  }
}
