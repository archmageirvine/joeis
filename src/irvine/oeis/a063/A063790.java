package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063790 a(n) is the smallest prime gap between n^2 and (n+1)^2.
 * @author Sean A. Irvine
 */
public class A063790 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    long g = Long.MAX_VALUE;
    long p = mPrime.nextPrime(++mN * mN);
    final long limit = (mN + 1) * (mN + 1);
    while (true) {
      final long q = p;
      p = mPrime.nextPrime(p);
      if (p > limit) {
        break;
      }
      if (p - q < g) {
        g = p - q;
      }
    }
    return Z.valueOf(g);
  }
}
