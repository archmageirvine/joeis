package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068066 The sum or half the sum of n consecutive primes starting at a(n) is prime.
 * @author Sean A. Irvine
 */
public class A068066 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    do {
      p = mPrime.nextPrime(p);
      Z sum = Z.valueOf(p);
      long q = p;
      for (int k = 1; k < mN; ++k) {
        q = mPrime.nextPrime(q);
        sum = sum.add(q);
      }
      if (sum.isProbablePrime()) {
        return Z.valueOf(p);
      }
    } while ((mN & 1) != 0);
    p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      Z sum = Z.valueOf(p);
      long q = p;
      for (int k = 1; k < mN; ++k) {
        q = mPrime.nextPrime(q);
        sum = sum.add(q);
      }
      if (sum.isEven() && sum.divide2().isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}

