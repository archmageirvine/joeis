package irvine.oeis.a026;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a065.A065409;

/**
 * A026301 Expansion of g.f. <code>sqrt(V(x))</code>, where <code>V(x) = Sum_{n &gt;= 0} A065409(n)*x^n</code>.
 * @author Sean A. Irvine
 */
public class A026301 extends A065409 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mPoly = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    mPoly.add(new Q(super.next()));
    return RING.sqrt(mPoly, ++mN).coeff(mN).toZ();
  }
}
