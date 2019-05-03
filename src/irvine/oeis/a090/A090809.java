package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090809 Coefficient of the irreducible character of <code>S_m</code> indexed by <code>(m-2n+2,2n-2)</code> in the n-th Kronecker power of the representation indexed by <code>(m-2,2)</code>.
 * @author Sean A. Irvine
 */
public class A090809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090809() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 2, 10, 31});
  }
}
