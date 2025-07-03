package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078500 Primes occurring only twice in a decade.
 * @author Sean A. Irvine
 */
public class A078500 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mQ = 0;
  private long mN = 10;

  @Override
  public Z next() {
    if (mQ != 0) {
      final Z res = Z.valueOf(mQ);
      mQ = 0;
      return res;
    }
    while (true) {
      mN += 10;
      final long p = mPrime.nextPrime(mN);
      if (p - mN < 10) {
        final long q = mPrime.nextPrime(p);
        if (q - mN < 10 && mPrime.nextPrime(q) - mN > 10) {
          mQ = q;
          return Z.valueOf(p);
        }
      }
    }
  }
}

