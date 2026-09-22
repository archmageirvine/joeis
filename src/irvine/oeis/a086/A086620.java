package irvine.oeis.a086;

import java.util.Arrays;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086620 Symmetric square table of coefficients, read by antidiagonals, where T(n,k) is the coefficient of x^n*y^k in f(x,y) that satisfies f(x,y) = 1/(1-x-y) + xy*f(x,y)^2.
 * @author Sean A. Irvine
 */
public class A086620 extends Sequence0 {

  private static final Polynomial<Z> N1 = Polynomial.create(-1);
  private static final Polynomial<Z> Y1 = Polynomial.create(1, -1);
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
      mF = ring.add(ring.series(ring.one(), ring.create(Arrays.asList(Y1, N1)), mN),
        ring.multiply(ring.pow(mF, 2, mN), inner.x()).shift(1));
    }
    return mF.coeff(mN - mM).coeff(mM);
  }
}
