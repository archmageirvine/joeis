package irvine.oeis.a036;

import irvine.math.group.PolynomialRing;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036648 Number of centered 5-valent trees with n nodes.
 * @author Sean A. Irvine
 */
public class A036648 extends Sequence0 {

  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);
  private static final CycleIndex S4 = SymmetricGroup.create(4).cycleIndex();
  private static final CycleIndex S5 = SymmetricGroup.create(5).cycleIndex();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 3) {
      return mN == 1 ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ZERO;
    Polynomial<Q> a = RING.one();
    for (int h = 1; h <= mN / 2; ++h) {
      final Polynomial<Q> b = RING.add(RING.one(), S4.apply(a, mN).shift(1));
      final Polynomial<Q> s = RING.subtract(S5.apply(b, mN), S5.apply(a, mN)).shift(1);
      final Polynomial<Q> t = RING.multiply(RING.subtract(b, a), RING.subtract(b, RING.one()), mN);
      sum = sum.add(s.coeff(mN).toZ()).subtract(t.coeff(mN).toZ());
      a = b;
    }
    return sum;
  }
}
