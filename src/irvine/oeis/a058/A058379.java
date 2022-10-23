package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058379 Essentially parallel series-parallel networks with n labeled edges, multiple edges not allowed.
 * @author Sean A. Irvine
 */
public class A058379 extends Sequence0 {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  protected int mN = -1;
  protected Z mF = Z.ONE;
  protected Polynomial<Q> mA = RING.x();

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
      mA = RING.subtract(RING.add(RING.subtract(RING.exp(mA, mN), RING.one()), RING.log1p(RING.x(), mN)), mA);
    }
    return mA.coeff(mN).multiply(mF).toZ();
  }
}

