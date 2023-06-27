package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195197 Number of Hamiltonian cycles in the generalized Petersen Graph P(n,2).
 * @author Sean A. Irvine
 */
public class A195197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195197() {
    super(3, new long[] {1, 0, 1, -1, -1, -1, -1, 1, -1, 1, 1, 1, 0}, new long[] {3, 8, 0, 6, 7, 12, 3, 30, 0, 34, 13, 56, 3});
  }
}
