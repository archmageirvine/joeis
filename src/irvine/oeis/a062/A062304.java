package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062304 Primes of the form k - mu(k).
 * @author Sean A. Irvine
 */
public class A062304 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final long t = mN - Functions.MOBIUS.i(mN);
      if (mPrime.isPrime(t)) {
        return Z.valueOf(t);
      }
    }
  }
}

