package irvine.oeis.a000;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000268 E.g.f.: <code>-log(1+log(1+log(1-x)))</code>.
 * @author Sean A. Irvine
 */
public class A000268 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;
  private Polynomial<Q> mA = RING.zero();

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN);
    mA = RING.add(mA, RING.monomial(new Q(-1, mN), mN));
    final Polynomial<Q> b = RING.log1p(mA, mN);
    Polynomial<Q> c = RING.one();
    for (int k = 1; k <= mN; ++k) {
      final Polynomial<Q> t = RING.divide(RING.pow(b, k, mN), new Q(k));
      c = RING.signedAdd((k & 1) == 0, c, t);
    }
    return c.coeff(mN).multiply(mF).toZ();
  }
}
