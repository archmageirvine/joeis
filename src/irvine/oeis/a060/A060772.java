package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A060772 Minimal Thompson primes: a(n) is the smallest prime expressible as p1*p2*...*pk-q1*q2*...*qj, where k+j=n and {p1,...,qj} are the first n primes.
 * @author Sean A. Irvine
 */
public class A060772 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mMaxPrime = 3;
  private Z mPrimorial = Z.SIX;
  private Z mMin = null;

  private void search(final Z a, final Z b, final long p) {
    if (p == mMaxPrime) {
      final Z t = a.subtract(b);
      if (t.compareTo(mMin) < 0 && t.isProbablePrime()) {
        mMin = t;
      }
      return;
    }
    final long q = mPrime.nextPrime(p);
    search(a.multiply(q), b, q);
    search(a, b.multiply(q), q);
  }

  @Override
  public Z next() {
    mMaxPrime = mPrime.nextPrime(mMaxPrime);
    mPrimorial = mPrimorial.multiply(mMaxPrime); // Convenient upper bound
    mMin = mPrimorial;
    search(Z.ONE, Z.ONE, 1);
    return mMin;
  }
}
