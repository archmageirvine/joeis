package irvine.oeis.a086;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086636 Triangle of coefficients, read by rows, where T(n,k) is the coefficient of x^n*y^k in f(x,y) that satisfies f(x,y) = (3-sqrt(1-4x))/2 + xy*f(x,y)^3.
 * @author Sean A. Irvine
 */
public class A086636 extends Sequence0 {

  private static final PolynomialRingField<Polynomial<Z>> RING = new PolynomialRingField<>(new PolynomialRingField<>(IntegerField.SINGLETON));
  private static final Polynomial<Polynomial<Z>> C2 = RING.monomial(Polynomial.create(2), 0);
  private static final Polynomial<Polynomial<Z>> C3 = RING.monomial(Polynomial.create(3), 0);
  private static final Polynomial<Polynomial<Z>> C4X = RING.monomial(Polynomial.create(4), 1);
  private Polynomial<Polynomial<Z>> mF = RING.one();
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      final DegreeLimitedPolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>(IntegerField.SINGLETON, mN);
      final PolynomialRingField<Polynomial<Z>> ring = new PolynomialRingField<>(inner);
      mF = ring.add(ring.divide(ring.subtract(C3, ring.sqrt1m(C4X, mN)), C2),
        ring.multiply(ring.pow(mF, 3, mN), inner.x()).shift(1));
    }
    return mF.coeff(mN).coeff(mM);
  }
}
