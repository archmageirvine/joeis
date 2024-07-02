package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071137 Number of times 2n+p is prime, with p=1 or prime p &lt; n.
 * @author Sean A. Irvine
 */
public class A071137 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long cnt = 0;
    for (long p = 1; p < mN; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(2 * mN + p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
