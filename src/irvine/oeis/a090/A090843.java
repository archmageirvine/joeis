package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090843 Number of nodes on a tree with degree 11 interior nodes and degree 1 boundary nodes.
 * @author Sean A. Irvine
 */
public class A090843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090843() {
    super(new long[] {-10, 11}, new long[] {1, 12});
  }
}
