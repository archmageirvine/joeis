package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260220 Number of <code>symmetry-allowed, linearly-independent</code> terms at n-th order in the expansion of <code>T1 x t1</code> rovibrational perturbation matrix <code>H(Jx,Jy,Jz)</code>.
 * @author Sean A. Irvine
 */
public class A260220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260220() {
    super(new long[] {1, 0, -2, 0, 0, 0, 2, 0}, new long[] {1, 1, 3, 2, 6, 4, 10, 6});
  }
}
