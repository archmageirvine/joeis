package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086505 a(n) is the n-th smallest prime p such that p+2n is also prime.
 * @author Sean A. Irvine
 */
public class A086505 extends Sequence1 {

  private final Fast mFast = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    long k = 0;
    while (true) {
      p = mFast.nextPrime(p);
      if (mFast.isPrime(p + 2 * mN) && ++k == mN) {
        return Z.valueOf(p);
      }
    }
  }
}

