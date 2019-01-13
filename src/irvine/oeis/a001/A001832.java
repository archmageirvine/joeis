package irvine.oeis.a001;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001832.
 * @author Sean A. Irvine
 */
public class A001832 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;
  private Polynomial<Q> mP = RING.zero();

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    Z c = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      c = c.add(Binomial.binomial(mN, k).shiftLeft(k * (mN - k)));
    }
    mP = RING.add(mP, RING.monomial(new Q(c, mF), mN));
    final Polynomial<Q> log = RING.log1p(mP, mN);
    return log.coeff(mN).multiply(mF).divide(2).toZ();
  }
}
