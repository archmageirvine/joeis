package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054395 Numbers m such that there are precisely 2 groups of order m.
 * @author Sean A. Irvine
 */
public class A054395 extends Sequence1 {

  // After Gheorghe Coserea

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long p = LongUtils.gcd(mN, Euler.phiAsLong(mN));
      if (!mPrime.isPrime(p)) {
        continue;
      }
      if (mN % (p * p) == 0) {
        if (LongUtils.gcd(p + 1, mN) == 1) {
          return Z.valueOf(mN);
        }
        continue;
      }
      final FactorSequence fs = Jaguar.factor(mN);
      long sum = 0;
      for (final Z q : fs.toZArray()) {
        if (q.longValue() % p == 1) {
          ++sum;
        }
      }
      if (sum == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
