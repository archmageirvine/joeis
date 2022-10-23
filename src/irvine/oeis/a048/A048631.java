package irvine.oeis.a048;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048631 Xfactorials - like factorials but use carryless GF(2)[ X ] polynomial multiplication.
 * @author Sean A. Irvine
 */
public class A048631 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(new GaloisField(2));
  private long mN = -1;
  private Polynomial<Z> mF = RING.one();

  @Override
  public Z next() {
    if (++mN > 1) {
      final long[] coeffs = new long[64];
      long m = mN;
      for (int k = 0; m != 0; ++k) {
        coeffs[k] = m & 1;
        m >>>= 1;
      }
      mF = RING.multiply(mF, Polynomial.create(coeffs));
    }
    Z res = Z.ZERO;
    for (int k = mF.degree(); k >= 0; --k) {
      res = res.multiply2().add(mF.coeff(k));
    }
    return res;
  }
}

