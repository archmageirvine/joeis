package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067199 Integers k such that k*28*c + 1 is prime for c = 1, 2, 4, 7 and 14.
 * @author Sean A. Irvine
 */
public class A067199 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z a = Z.valueOf(28 * mN + 1);
      if (mPrime.isPrime(a)) {
        final Z b = Z.valueOf(56 * mN + 1);
        if (mPrime.isPrime(b)) {
          final Z c = Z.valueOf(112 * mN + 1);
          if (mPrime.isPrime(c)) {
            final Z d = Z.valueOf(196 * mN + 1);
            if (mPrime.isPrime(d)) {
              final Z e = Z.valueOf(392 * mN + 1);
              if (mPrime.isPrime(e)) {
                return Z.valueOf(mN);
              }
            }
          }
        }
      }
    }
  }
}
