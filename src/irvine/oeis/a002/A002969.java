package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002969 E.g.f. 1/(1 - sin(x) + sin(x)^2).
 * @author Sean A. Irvine
 */
public class A002969 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> sin = RING.sin(RING.x(), mN);
    return RING.series(RING.one(),
      RING.add(RING.subtract(RING.one(), sin),
        RING.pow(sin, 2, mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
