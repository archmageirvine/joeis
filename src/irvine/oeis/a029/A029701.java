package irvine.oeis.a029;

import irvine.math.group.IntegerField;
import irvine.math.group.MultivariatePolynomialRing;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029701 Number of lines on the intersection of two general hypersurfaces of degree n in complex projective (n+2)-space.
 * @author Sean A. Irvine
 */
public class A029701 implements Sequence {

  private static final PolynomialRing<Z> RINGX = new PolynomialRing<>(Integers.SINGLETON);
  private static final MultivariatePolynomialRing RING = new MultivariatePolynomialRing(2);
  private static final MultivariatePolynomial<Z> XMY = RING.subtract(MultivariatePolynomial.create(IntegerField.SINGLETON, RINGX.x(), 0, 2), MultivariatePolynomial.create(IntegerField.SINGLETON, RINGX.x(), 1, 2));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    MultivariatePolynomial<Z> product = RING.one();
    for (int k = 0; k <= mN; ++k) {
      final MultivariatePolynomial<Z> t0 = MultivariatePolynomial.create(IntegerField.SINGLETON, RINGX.monomial(Z.valueOf(k), 1), 0, 2);
      final MultivariatePolynomial<Z> t1 = MultivariatePolynomial.create(IntegerField.SINGLETON, RINGX.monomial(Z.valueOf(mN - k), 1), 1, 2);
      final MultivariatePolynomial<Z> t = RING.pow(RING.add(t0, t1), 2);
      product = RING.multiply(product, t);
    }
    product = RING.multiply(product, XMY);
    return product.extract(0, mN + 2).toPolynomial().coeff(mN + 1);
  }
}
