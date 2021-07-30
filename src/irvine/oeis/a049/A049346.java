package irvine.oeis.a049;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049346 Coefficient of x^(-n) in expansion of continued fraction 0, x, x^2, x^3, x^4, ... .
 * @author Sean A. Irvine
 */
public class A049346 implements Sequence {

  private final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    // Not very efficient repeated computation
    Polynomial<Z> gf = RING.one();
    for (int k = mN - 1; k >= 0; --k) {
      final Polynomial<Z> m = RING.monomial(Z.ONE, k + 1);
      final Polynomial<Z> t = RING.subtract(RING.one(), RING.series(m, gf, mN));
      gf = RING.add(RING.one(), RING.series(m, t, mN));
    }
    return RING.subtract(RING.one(), RING.series(RING.one(), gf, mN)).coeff(mN);
  }
}
