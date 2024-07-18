package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071386.
 * @author Sean A. Irvine
 */
public class A071414 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long r = 1; r < 2 * mN; ++r) {
      if (mPrime.isPrime(2 * mN + r) && mPrime.isPrime(4 * mN + r)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
