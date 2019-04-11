package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056005 Number of 3-element ordered antichains on <code>an</code> unlabeled n-element set; T_1-hypergraphs with 3 labeled nodes and n hyperedges.
 * @author Sean A. Irvine
 */
public class A056005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056005() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 0, 2, 19, 90, 302, 820});
  }
}
