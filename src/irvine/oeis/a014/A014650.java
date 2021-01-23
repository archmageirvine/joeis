package irvine.oeis.a014;

import irvine.factor.factor.Cheetah;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014650 Number of partitions of n into its divisors that are powers of primes (A000961) with at least one part of size 1.
 * @author Sean A. Irvine
 */
public class A014650 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    Polynomial<Z> prod = RING.oneMinusXToTheN(1); // handle divisor 1
    for (final Z p : Cheetah.factor(++mN).toZArray()) {
      if (!Z.ONE.equals(p)) {
        final int q = p.intValueExact();
        int r = q;
        while (mN % r == 0) {
          prod = RING.multiply(prod, RING.oneMinusXToTheN(r), mN);
          r *= q;
        }
      }
    }
    return RING.coeff(RING.one(), prod, mN - 1);
  }
}
