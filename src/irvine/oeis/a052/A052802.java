package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052802 E.g.f. satisfies: A(x) = 1/(1 + log(1 - x*A(x))).
 * @author Sean A. Irvine
 */
public class A052802 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mA = RING.one();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
      mA = RING.series(RING.one(), RING.add(RING.one(), RING.log1p(RING.negate(mA.shift(1)), mN)), mN);
    }
    return mA.coeff(mN).multiply(mF).toZ();
  }
}
