package irvine.oeis.a001;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001765.
 * @author Sean A. Irvine
 */
public class A001765 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;
  private Polynomial<Q> mA = RING.zero();

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN);
    mA = RING.add(mA, RING.monomial(new Q(-1, mN), mN));
    final Polynomial<Q> f = RING.log1p(RING.log1p(RING.log1p(RING.log1p(RING.log1p(RING.log1p(mA, mN), mN), mN), mN), mN), mN);
    return f.coeff(mN).negate().multiply(mF).toZ();
  }
}
