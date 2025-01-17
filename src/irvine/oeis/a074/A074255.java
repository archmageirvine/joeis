package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074255 Numbers n such that the sum of composites from the smallest prime factor of n to the largest prime factor of n is equal to the sum of squarefree numbers from the smallest prime factor of n to the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A074255 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Z sum = Z.ZERO;
      for (long k = fs.leastPrimeFactor().longValue(); k <= fs.largestPrimeFactor().longValue(); ++k) {
        if (Predicates.SQUARE_FREE.is(k)) {
          sum = sum.add(k);
        }
        if (!mPrime.isPrime(k)) {
          sum = sum.subtract(k);
        }
      }
      if (sum.isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
