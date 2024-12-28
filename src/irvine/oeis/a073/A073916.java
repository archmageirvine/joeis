package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073916 The n-th number with n divisors.
 * @author Sean A. Irvine
 */
public class A073916 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      return Functions.PRIME.z(mN).pow(mN - 1);
    }
    long k = 0;
    long j = 0;
    while (true) {
      if (Functions.SIGMA0.l(++k) == mN && ++j == mN) {
        return Z.valueOf(k);
      }
    }
  }
}

