package irvine.oeis.a006;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006959 Number of labeled M-type rooted trees on n nodes.
 * @author Sean A. Irvine
 */
public class A006959 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());
  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    Polynomial<Q> a = RING.zero();
    for (int k = 1; k <= mN; ++k) {
      a = RING.subtract(RING.subtract(RING.exp(RING.add(RING.x(), a), mN),
        RING.one()),
        RING.multiply(a,
          RING.add(RING.one(), RING.log1p(NEG_X, mN)), mN));
    }
    return a.coeff(mN).multiply(mF).toZ();
  }
}
