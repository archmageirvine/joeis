package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394906 allocated for David Dewan.
 * @author Sean A. Irvine
 */
public class A394906 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mN = 1;

  private Z search(Z rep, final long n, long p) {
    if (n == 0) {
      while (p > 1) {
        rep = rep.multiply(10);
        p = mPrime.prevPrime(p);
      }
      return rep;
    }
    if (p > 1) {
      for (long k = n / p; k >= 0; --k) {
        final Z s = search(rep.multiply(10).add(k), n - k * p, mPrime.prevPrime(p));
        if (s != null) {
          return s;
        }
      }
    }
    return null;
  }

  @Override
  public Z next() {
    if (++mN > mP) {
      mP = mPrime.nextPrime(mP);
    }
    return search(Z.ZERO, mN, mP);
  }
}
