package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020875 Number of (undirected) Hamiltonian paths in n-Moebius ladder.
 * @author Sean A. Irvine
 */
public class A020875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020875() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 4, 12, 36, 72, 140});
  }
}
