package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137889 Number of directed Hamiltonian paths in the n-Hanoi graph.
 * @author Sean A. Irvine
 */
public class A137889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137889() {
    super(new long[] {-192, 316, -147, 24}, new long[] {6, 36, 384, 5460});
  }
}
