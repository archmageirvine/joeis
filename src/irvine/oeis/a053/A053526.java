package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053526 Number of bipartite graphs with 3 edges on nodes {1..n}.
 * @author Sean A. Irvine
 */
public class A053526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053526() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 0, 16, 110, 435});
  }
}
