package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055380 Central prime p in the smallest (2n+1)-tuple of consecutive primes that are symmetric with respect to p.
 * @author Sean A. Irvine
 */
public class A055380 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 5;
  private int mN = 0;

  protected long is(final long p, final int n) {
    long f = p;
    long r = p;
    for (int k = 0; k < n; ++k) {
      f = mPrime.nextPrime(f);
      r = mPrime.prevPrime(r);
      if (f - p != p - r) {
        return 0;
      }
    }
    return r;
  }

  @Override
  public Z next() {
    ++mN;
    while (is(mP, mN) == 0) {
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mP);
  }

}
