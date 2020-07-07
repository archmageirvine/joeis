package irvine.oeis.a046;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046025 Numbers n such that <code>6n+1, 12n+1</code> and <code>18n+1</code> are all primes.
 * @author Sean A. Irvine
 */
public class A046025 implements Sequence {

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
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
