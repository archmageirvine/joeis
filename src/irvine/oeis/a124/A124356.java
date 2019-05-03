package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124356 Number of (directed) Hamiltonian cycles on the Moebius ladder graph <code>M_n</code> (for <code>n&gt;=4)</code>.
 * @author Sean A. Irvine
 */
public class A124356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124356() {
    super(new long[] {-1, 1, 1}, new long[] {2, 8, 6});
  }
}
