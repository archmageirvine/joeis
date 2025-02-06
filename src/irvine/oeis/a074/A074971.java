package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074971 Number of partitions of n into distinct parts of order n.
 * @author Sean A. Irvine
 */
public class A074971 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      final int m = Functions.MOBIUS.i(mN / d.longValue());
      if (m != 0) {
        Polynomial<Z> prod = RING.one();
        for (final Z k : Jaguar.factor(d).divisors()) {
          prod = RING.multiply(prod, RING.onePlusXToTheN(k.intValue()), mN);
        }
        sum = sum.signedAdd(m == 1, prod.coeff(mN));
      }
    }
    return sum;
  }
}
