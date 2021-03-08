package irvine.oeis.a042;

import irvine.math.z.Z;

/**
 * A042980 Number of degree-n irreducible polynomials over GF(2) with trace = 0 and subtrace = 0.
 * @author Sean A. Irvine
 */
public class A042980 extends A042979 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = (6 - (mN & 3)) & 3; k <= mN; k += 4) {
      sum = sum.add(l(mN, k));
    }
    return sum.divide(mN);
  }
}
