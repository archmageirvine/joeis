package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260220 Number of symmetry-allowed, linearly-independent terms at n-th order in the expansion of T1 x t1 rovibrational perturbation matrix H(Jx,Jy,Jz).
 * @author Sean A. Irvine
 */
public class A260220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260220() {
    super(new long[] {1, 0, -2, 0, 0, 0, 2, 0}, new long[] {1, 1, 3, 2, 6, 4, 10, 6});
  }
}
