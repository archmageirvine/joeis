package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A076083 Consider all composite numbers between prime(n) and prime(n+1); take those with smallest number of divisors; a(n) is the smallest of them.
 * @author Sean A. Irvine
 */
public class A076083 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long k = mP;
    long minS = Long.MAX_VALUE;
    long min = 0;
    while (!mPrime.isPrime(++k)) {
      final long s0 = Functions.SIGMA0.l(k);
      if (s0 < minS) {
        minS = s0;
        min = k;
      }
    }
    return Z.valueOf(min);
  }
}
