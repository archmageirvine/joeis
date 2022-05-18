package irvine.oeis.a014;

import irvine.factor.factor.Jaguar;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014652 Number of partitions of n in its prime divisors with at least one part of size 1.
 * @author Sean A. Irvine
 */
public class A014652 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    Polynomial<Z> prod = RING.oneMinusXToTheN(1); // handle divisor 1
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      if (!Z.ONE.equals(p)) {
        prod = RING.multiply(prod, RING.oneMinusXToTheN(p.intValue()), mN);
      }
    }
    return RING.coeff(RING.one(), prod, mN - 1);
  }
}
