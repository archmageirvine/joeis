package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058561 A 3-way generalization of series-parallel networks with n labeled edges.
 * @author Sean A. Irvine
 */
public class A058561 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = RING.onePlusXToTheN(1);
  private int mN = -1;
  private Polynomial<Q> mP = RING.zero();
  private Polynomial<Q> mQ = RING.zero();
  private Polynomial<Q> mS = RING.zero();
  private Z mF = Z.ONE;

  private Polynomial<Q> update(final Polynomial<Q> q) {
    return RING.subtract(RING.subtract(RING.exp(RING.add(RING.x(), q), mN), C1), q);
  }

  private void updateP() {
    mP = update(mQ);
  }

  private void updateQ() {
    mQ = update(mS);
  }

  private void updateS() {
    mS = update(mP);
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.valueOf(mN);
    }
    mF = mF.multiply(mN);
    updateP();
    updateQ();
    updateS();
    return mP.coeff(mN).add(mQ.coeff(mN)).add(mS.coeff(mN)).multiply(mF).toZ();
  }
}
