package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.RationalUnityExtension;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045515 Number of conjugacy classes of elements of order n in 2.E_7(C).
 * @author Sean A. Irvine
 */
public class A045515 extends Sequence0 {

  private static final RationalUnityExtension E2 = new RationalUnityExtension(2);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(E2);
  // (1-x)(1-x^2)^2(1-x^3)(1-x^4)(1-zx)(1-zx^2)(1-zx^3), z^2=1
  private static final Polynomial<Polynomial<Q>> DEN = RING.multiply(
    RING.multiply(
      RING.multiply(
        RING.multiply(
          RING.multiply(
            RING.multiply(
              RING.oneMinusXToTheN(1),
              RING.pow(RING.oneMinusXToTheN(2), 2)),
            RING.oneMinusXToTheN(3)),
          RING.oneMinusXToTheN(4)),
        RING.oneMinusXToTheN(E2.x(), 1)),
      RING.oneMinusXToTheN(E2.x(), 2)),
    RING.oneMinusXToTheN(E2.x(), 3));
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Polynomial<Polynomial<Q>> s = RING.series(RING.one(), DEN, mN);
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(s.coeff(d).coeff(0).toZ().multiply(Functions.MOBIUS.i((long) (mN / d))));
    }
    return sum;
  }
}
