package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057458.
 * @author Sean A. Irvine
 */
public class A057458 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k < mN; ++k) {
      if (mPrime.isPrime(k * (mN - k) + 1)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
