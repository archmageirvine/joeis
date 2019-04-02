package irvine.oeis.a096;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A096225 a(0) = 1; for n &gt;= 0, a(n+1) = smallest prime factor of a(n)! + 1.
 * @author Sean A. Irvine
 */
public class A096225 implements Sequence {

  private long mA = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 1;
    } else {
      // If p is a prime, then p | (p-1)!+1
      long p = mA + 1;
      if (mPrime.isPrime(p)) {
        mA = p;
      } else {
        // Sequential search
        while (true) {
          p = mPrime.nextPrime(p);
          long f = 1;
          for (long k = 2; k <= mA; ++k) {
            f *= k;
            f %= p;
          }
          if (f == p - 1) {
            mA = p;
            break;
          }
        }
      }
    }
    return Z.valueOf(mA);
  }
}

