package irvine.oeis.a086;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086632 Triangle of coefficients, read by rows, where T(n,k) is the coefficient of x^n*y^k in f(x,y) that satisfies f(x,y) = 1/(1-x) - x^2/(1-x)^3 + xy*f(x,y)^3.
 * @author Sean A. Irvine
 */
public class A086632 extends Sequence0 {

  private Polynomial<Polynomial<Z>> mF = new PolynomialRingField<>(new PolynomialRingField<>(IntegerField.SINGLETON)).one();
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      final DegreeLimitedPolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>(IntegerField.SINGLETON, mN);
      final PolynomialRingField<Polynomial<Z>> ring = new PolynomialRingField<>(inner);
      mF = ring.add(ring.series(ring.one(), ring.oneMinusXToTheN(1), mN),
        ring.series(ring.monomial(Polynomial.create(-1), 2), ring.pow(ring.oneMinusXToTheN(1), 3, mN), mN),
        ring.multiply(ring.pow(mF, 3, mN), inner.x()).shift(1));
    }
    return mF.coeff(mN).coeff(mM);
  }
}
