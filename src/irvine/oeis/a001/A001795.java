package irvine.oeis.a001;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001795 Coefficients of Legendre polynomials.
 * @author Sean A. Irvine
 */
public class A001795 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    final Polynomial<Q> sqrt1m = RING.sqrt1m(RING.x(), mN);
    final Polynomial<Q> sqrt1p = RING.sqrt1p(RING.x(), mN);
    final Polynomial<Q> s = RING.series(RING.one(), RING.add(sqrt1p, sqrt1m), mN);
    return s.coeff(mN).num();
  }
}
