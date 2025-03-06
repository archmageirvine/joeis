package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A075756 Number of hierarchies of hierarchies of hierarchies on n points.
 * @author Sean A. Irvine
 */
public class A075756 extends A075744 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    final Z t = super.next();
    mA.add(++mN == 0 ? Q.ZERO : new Q(t, Functions.FACTORIAL.z(mN)));
    return RING.exp(mA, mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
