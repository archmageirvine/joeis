package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137883 Number of (directed) Hamiltonian paths in the <code>n-M&#246;bius</code> ladder graph.
 * @author Sean A. Irvine
 */
public class A137883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137883() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {72, 144, 280, 456, 728, 1056});
  }
}
