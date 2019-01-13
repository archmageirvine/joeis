package irvine.oeis.a006;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006365.
 * @author Sean A. Irvine
 */
public class A006365 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO = RING.monomial(Q.TWO, 0);
  private static final Q FOUR = new Q(4);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Q> a = RING.one();
    for (int k = 1; k <= mN; ++k) {
      final Polynomial<Q> r = RING.multiply(a, FOUR).shift(k);
      final Polynomial<Q> sqrt = RING.sqrt1m(r, mN);
      final Polynomial<Q> s = RING.series(TWO, RING.add(RING.one(), sqrt), mN);
      a = RING.multiply(a, s, mN);
    }
    return a.coeff(mN).toZ();
  }
}

