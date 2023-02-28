package irvine.oeis.a061;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061683 Generalized Bell numbers.
 * @author Sean A. Irvine
 */
public class A061683 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mSum = RING.empty();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    if (mN == 0) {
      mSum.add(Q.ZERO);
    } else {
      mSum.add(new Q(Z.ONE, mF.pow(3).multiply(mN + 1)));
    }
    Polynomial<Q> e = RING.exp(mSum, mN);
    for (int k = 0; k < mN; ++k) {
      e = RING.diff(e);
    }
    return e.coeff(0).multiply(mF.square()).multiply(mN + 1).toZ();
  }
}

