package irvine.oeis.a068;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068154 Numerators of coefficients in power series for (Product_{i=1..5} (x+i)) / (Product_{i=1..5} (i-x)) = Sum_{n&gt;=0} a(n)/b(n)*x^n.
 * @author Sean A. Irvine
 */
public class A068154 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = PolynomialUtils.zToQ(Polynomial.create(120, 274, 225, 85, 15, 1));
  private static final Polynomial<Q> DEN = PolynomialUtils.zToQ(Polynomial.create(120, -274, 225, -85, 15, -1));
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN).num();
  }
}
