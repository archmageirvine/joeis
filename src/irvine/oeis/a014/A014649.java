package irvine.oeis.a014;

import irvine.factor.factor.Jaguar;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014649 Number of partitions of n into its nonprime power divisors with at least one part of size 1.
 * @author Sean A. Irvine
 */
public class A014649 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    Polynomial<Z> prod = RING.one();
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (!d.isProbablePrime()) {
        final Z b = d.isPower();
        if (b == null || !b.isProbablePrime()) {
          prod = RING.multiply(prod, RING.oneMinusXToTheN(d.intValueExact()), mN);
        }
      }
    }
    return RING.coeff(RING.one(), prod, mN - 1);
  }
}
