package irvine.oeis.a042;

import irvine.math.z.Z;

/**
 * A042982 Number of degree-n irreducible polynomials over GF(2) with trace = 1 and subtrace = 1.
 * @author Sean A. Irvine
 */
public class A042982 extends A042979 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = (7 - (mN & 3)) & 3; k <= mN; k += 4) {
      sum = sum.add(l(mN, k));
    }
    return sum.divide(mN);
  }
}
