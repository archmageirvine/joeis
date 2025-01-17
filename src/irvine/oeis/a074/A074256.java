package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A074256 Numbers k such that the sum of factorials of the digits of k equals the sum of the primes from the smallest prime factor of k to the largest prime factor of k.
 * @author Sean A. Irvine
 */
public class A074256 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Z sum = Z.ZERO;
      for (long k = fs.leastPrimeFactor().longValue(); k <= fs.largestPrimeFactor().longValue(); k = mPrime.nextPrime(k)) {
        sum = sum.add(k);
      }
      final int[] cnts = ZUtils.digitCounts(mN);
      for (int k = 0; k < cnts.length; ++k) {
        sum = sum.subtract(Functions.FACTORIAL.z(k).multiply(cnts[k]));
      }
      if (sum.isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
