package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002300 Coefficients in the expansion of B^2*C^3 in Watson's notation of page 118.
 * @author Sean A. Irvine
 */
public class A002300 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> gf = RING.one();
    for (int k = 1; k <= mN; ++k) {
      final Polynomial<Z> a = RING.pow(RING.oneMinusXToTheN(k), 2, mN);
      final Polynomial<Z> b = RING.pow(RING.oneMinusXToTheN(7 * k), 3, mN);
      final Polynomial<Z> t = RING.multiply(a, b, mN);
      gf = RING.multiply(gf, t);
    }
    return gf.coeff(mN);
  }
}
