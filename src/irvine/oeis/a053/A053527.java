package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053527 Number of bipartite graphs with 4 edges on nodes {1..n}.
 * @author Sean A. Irvine
 */
public class A053527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053527() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 0, 0, 0, 3, 140, 1125, 5355, 19075});
  }
}
