package irvine.oeis.a008;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008990 Numerators of sequence having sqrt(cos(x)) as e.g.f. (even-indexed coefficients only).
 * @author Sean A. Irvine
 */
public class A008990 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 1) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    return RING.sqrt(RING.cos(RING.x(), mN), mN).coeff(mN).multiply(mF).num();
  }
}

