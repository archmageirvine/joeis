package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124349 Numbers of directed Hamiltonian cycles on the n-prism graph.
 * @author Sean A. Irvine
 */
public class A124349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124349() {
    super(new long[] {-1, 1, 1}, new long[] {6, 12, 10});
  }
}
