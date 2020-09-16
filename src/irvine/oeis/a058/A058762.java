package irvine.oeis.a058;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A058762 McKay-Thompson series of class 87A for Monster.
 * @author Sean A. Irvine
 */
public class A058762 extends A058611 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.monomial(Q.THREE, 1);
  private static final Q EIGHT = new Q(8);
  private final Polynomial<Q> mT = RING.create(Collections.emptyList());
  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    mT.add(new Q(super.next()));
    final Polynomial<Q> t3 = mT.substitutePower(3, mN);
    final Polynomial<Q> a = RING.add(RING.add(mT, C).shift(2), t3); // scaled by q^3
    final Polynomial<Q> b = RING.multiply(RING.subtract(RING.multiply(mT, t3, mN), C.shift(3)), EIGHT); // scaled by q^4
    final Polynomial<Q> c = RING.pow(a, 2, mN); // scaled by q^6
    final Polynomial<Q> s = RING.sqrt(RING.add(c, b.shift(2)), mN); // scaled by q^3
    return s.coeff(mN).subtract(a.coeff(mN)).toZ().divide(4);
  }
}
