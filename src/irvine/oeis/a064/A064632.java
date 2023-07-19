package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A064632 Smallest prime p such that n = (p-1)/(q-1) for some prime q.
 * @author Sean A. Irvine
 */
public class A064632 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      if ((p - 1) % mN == 0 && mPrime.isPrime((p - 1) / mN + 1)) {
        return Z.valueOf(p);
      }
    }
  }
}
