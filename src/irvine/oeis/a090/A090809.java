package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090809 Coefficient of the irreducible character of S_m indexed by (m-2n+2,2n-2) in the n-th Kronecker power of the representation indexed by (m-2,2).
 * @author Sean A. Irvine
 */
public class A090809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090809() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 2, 10, 31});
  }
}
