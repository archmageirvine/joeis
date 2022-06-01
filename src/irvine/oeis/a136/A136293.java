package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136293 Linear bound on the genera of Heegaard splittings of closed, orientable 3-manifolds that admit a generalized triangulation with n generalized tetrahedra.
 * @author Sean A. Irvine
 */
public class A136293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136293() {
    super(new long[] {-1, 2}, new long[] {26, 102});
  }
}
