package irvine.oeis.a007;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007119 Expansion of (1-x)^sin(x).
 * @author Sean A. Irvine
 */
public class A007119 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NX = RING.negate(RING.x());
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.multiply(RING.sin(RING.x(), mN), RING.log1p(NX, mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
