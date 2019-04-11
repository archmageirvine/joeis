package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053528 Number of bipartite graphs with 5 edges on nodes <code>{1..n}</code>.
 * @author Sean A. Irvine
 */
public class A053528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053528() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 0, 0, 0, 0, 60, 1701, 14952, 81228, 331884, 1116675});
  }
}
