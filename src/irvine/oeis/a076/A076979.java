package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076979 Deleting exactly one digit yields a prime.
 * @author Sean A. Irvine
 */
public class A076979 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final long s = ++mN;
      long m = 1;
      long m10 = 10;
      while (m < s) {
        final long c = (s / m10) * m + s % m;
        if (mPrime.isPrime(c)) {
          return Z.valueOf(mN);
        }
        m = m10;
        m10 *= 10;
      }
    }
  }
}

