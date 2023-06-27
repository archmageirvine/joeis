package irvine.oeis.a115;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A115504 Number of monic irreducible polynomials of degree 1 in GF(2^n)[x1,x2,x3,x4,x5].
 * @author Sean A. Irvine
 */
public class A115504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115504() {
    super(1, new long[] {32768, -31744, 9920, -1240, 62}, new long[] {62, 1364, 37448, 1118480, 34636832});
  }
}
