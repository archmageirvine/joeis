package irvine.oeis.a026;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a065.A065409;

/**
 * A026301 Expansion of g.f. sqrt(V(x)), where V(x) = Sum_{n &gt;= 0} A065409(n)*x^n.
 * @author Sean A. Irvine
 */
public class A026301 extends A065409 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mPoly = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mPoly.add(new Q(super.next()));
    return RING.sqrt(mPoly, ++mN).coeff(mN).toZ();
  }
}
