package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064573 Number of partitions of n into parts which are all powers of the same prime.
 * @author Sean A. Irvine
 */
public class A064573 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    long s = 0;
    for (int k = 2; k <= mN; k = (int) mPrime.nextPrime(k)) {
      ++s;
      Polynomial<Z> prod = RING.one();
      for (int r = 1; r <= mN; r *= k) {
        prod = RING.multiply(prod, RING.oneMinusXToTheN(r));
      }
      sum = RING.add(sum, RING.series(RING.one(), prod, mN));
    }
    return sum.coeff(mN).subtract(s);
  }
}

