package irvine.oeis.a004;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004130 Numerators in expansion of <code>(1-x)^{-1/4}</code>.
 * @author Sean A. Irvine
 */
public class A004130 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X4 = RING.monomial(new Q(4), 1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.sqrt(RING.series(RING.one(), RING.sqrt1m(X4, mN), mN), mN).coeff(mN).num();
  }
}
