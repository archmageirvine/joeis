package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002322;

/**
 * A033502 Carmichael numbers of the form (6*k+1)*(12*k+1)*(18*k+1), where 6*k+1, 12*k+1 and 18*k+1 are all primes.
 * @author Sean A. Irvine
 */
public class A033502 extends A002322 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z a = Z.valueOf(6 * mN + 1);
      if (mPrime.isPrime(a)) {
        final Z b = Z.valueOf(12 * mN + 1);
        if (mPrime.isPrime(b)) {
          final Z c = Z.valueOf(18 * mN + 1);
          if (mPrime.isPrime(c)) {
            final Z n = a.multiply(b).multiply(c);
            if (!mPrime.isPrime(n) && n.mod(lambda(n.longValueExact())).equals(Z.ONE)) {
              return n;
            }
          }
        }
      }
    }
  }
}
