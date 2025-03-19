package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A076082 Consider all composite numbers between prime(n) and prime(n+1); take those with greatest number of divisors; a(n) is the smallest of them.
 * @author Sean A. Irvine
 */
public class A076082 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long k = mP;
    long maxS = 0;
    long max = 0;
    while (!mPrime.isPrime(++k)) {
      final long s0 = Functions.SIGMA0.l(k);
      if (s0 > maxS) {
        maxS = s0;
        max = k;
      }
    }
    return Z.valueOf(max);
  }
}
