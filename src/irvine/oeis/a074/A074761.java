package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074761 Number of partitions of n of order n.
 * @author Sean A. Irvine
 */
public class A074761 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final int m = Functions.MOBIUS.i(mN / d.intValue());
      if (m != 0) {
        Polynomial<Z> p = RING.one();
        for (final Z e : Jaguar.factor(d).divisors()) {
          p = RING.multiply(p, RING.oneMinusXToTheN(e.intValue()), mN + 5);
        }
        sum = sum.signedAdd(m == 1, RING.coeff(RING.one(), p, mN));
      }
    }
    return sum;
  }
}
