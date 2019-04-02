package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124353 Number of (directed) Hamiltonian circuits on the n-antiprism graph.
 * @author Sean A. Irvine
 */
public class A124353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124353() {
    super(new long[] {1, 0, -2, -1, 3}, new long[] {6, 18, 32, 58, 112});
  }
}
