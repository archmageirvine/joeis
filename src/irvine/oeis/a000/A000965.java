package irvine.oeis.a000;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000965 Numerators of expansion of e.g.f. sinh(x) / sin(x) (even powers only).
 * @author Sean A. Irvine
 */
public class A000965 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.ONE;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN > 1) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    final Polynomial<Q> sinhx = RING.sinh(RING.x(), mN + 2);
    final Polynomial<Q> sinx = RING.sin(RING.x(), mN + 2);
    final Q c = RING.coeff(sinhx, sinx, mN);
    return select(c.multiply(mF));
  }
}
