package irvine.oeis.a025;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025156 A prime number of consecutive composites follow n.
 * @author Sean A. Irvine
 */
public class A025156 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long cnt = 0;
      long m = mN;
      while (!mPrime.isPrime(++m)) {
        ++cnt;
      }
      if (mPrime.isPrime(cnt)) {
        return Z.valueOf(mN);
      }
    }
  }
}
