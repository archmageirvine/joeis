package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.IntegerUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002100 a(n) = number of partitions of n into semiprimes (more precisely, number of ways of writing n as a sum of products of 2 distinct primes).
 * @author Sean A. Irvine
 */
public class A002100 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> den = RING.one();
    for (int k = 6; k <= mN; ++k) {
      final int s = IntegerUtils.sqrt(k);
      if (s * s != k) {
        final int semi = Jaguar.factor(k).isSemiprime();
        if (semi == FactorSequence.UNKNOWN) {
          throw new UnsupportedOperationException();
        } else if (semi == FactorSequence.YES) {
          den = RING.multiply(den, RING.oneMinusXToTheN(k), mN);
        }
      }
    }
    return RING.coeff(RING.one(), den, mN);
  }
}
