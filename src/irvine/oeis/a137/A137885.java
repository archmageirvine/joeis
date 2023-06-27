package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137885 Number of directed Hamiltonian paths in the 2n-crossed prism graph.
 * @author Sean A. Irvine
 */
public class A137885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137885() {
    super(2, new long[] {8, -12, 6}, new long[] {144, 576, 1920});
  }
}
