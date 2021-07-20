package irvine.oeis.a000;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000359 Coefficients of iterated exponentials.
 * @author Sean A. Irvine
 */
public class A000359 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;
  private Polynomial<Q> mA = RING.zero();

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN);
    mA = RING.add(mA, RING.monomial(new Q(-1, mN), mN));
    final Polynomial<Q> d = RING.log1p(RING.log1p(RING.log1p(RING.log1p(mA, mN), mN), mN), mN);
    return d.coeff(mN).negate().multiply(mF).toZ();
  }
}
