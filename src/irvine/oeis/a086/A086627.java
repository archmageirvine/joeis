package irvine.oeis.a086;

import java.util.Arrays;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086627 Main diagonal of square table A086626 of coefficients of x^n*y^k in f(x,y) that satisfies f(x,y) = (1-xy)/[(1-x)(1-y)] + xy*f(x,y)^3.
 * @author Sean A. Irvine
 */
public class A086627 extends Sequence0 {

  private static final Polynomial<Z> NX = Polynomial.create(0, -1);
  private static final Polynomial<Z> Y1 = Polynomial.create(1, -1);
  private Polynomial<Polynomial<Z>> mF = new PolynomialRingField<>(new PolynomialRingField<>(IntegerField.SINGLETON)).one();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final DegreeLimitedPolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>(IntegerField.SINGLETON, mN);
    final PolynomialRingField<Polynomial<Z>> ring = new PolynomialRingField<>(inner);
    mF = ring.add(ring.series(ring.create(Arrays.asList(inner.one(), NX)), ring.multiply(ring.oneMinusXToTheN(1), Y1), mN),
      ring.multiply(ring.pow(mF, 3, mN), inner.x()).shift(1));
    return mF.coeff(mN).coeff(mN);
  }
}
