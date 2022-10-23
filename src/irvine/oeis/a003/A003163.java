package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003163 Denominators of Van der Pol numbers.
 * @author Sean A. Irvine
 */
public class A003163 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.monomial(Q.ONE, 3);
  private static final Polynomial<Q> SIXX = RING.monomial(Q.SIX, 1);
  private static final Q TWELVE = new Q(12);
  private int mN = -1;
  private Z mF = Z.ONE;

  protected Z res(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    final Polynomial<Q> exp = RING.exp(RING.x(), mN + 3);
    return res(RING.coeff(NUM,
      RING.subtract(RING.multiply(RING.add(exp, RING.one()), SIXX),
        RING.multiply(RING.subtract(exp, RING.one()), TWELVE)), mN)
      .multiply(mF));
  }
}
