package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086979 Increasing peaks in the prime gap sequence A038664.
 * @author Sean A. Irvine
 */
public class A086979 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mB = 2;
  private long mBK = 1;
  private long mMax = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long k = 1;
      long a = 2;
      while (mPrime.nextPrime(a) - a != 2 * mN) {
        ++k;
        a = mPrime.nextPrime(a);
      }
      if (a < mB && mB >= mMax) {
        final long res = mBK;
        mB = a;
        mBK = k;
        if (mB > mMax) {
          mMax = mB;
        }
        return Z.valueOf(res);
      }
      mB = a;
      mBK = k;
      if (mB > mMax) {
        mMax = mB;
      }
    }
  }
}
