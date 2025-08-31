package irvine.oeis.a079;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079877 Numbers that are divisible by at least one pair of twin primes (A001097).
 * @author Sean A. Irvine
 */
public class A079877 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 14;

  private boolean is(final long n) {
    for (final Z p : Jaguar.factor(n).toZArray()) {
      final long q = p.longValue() + 2;
      if (mPrime.isPrime(q) && n % q == 0) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

