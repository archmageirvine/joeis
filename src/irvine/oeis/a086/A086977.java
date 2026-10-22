package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086977 Increasing peaks in the prime gap sequence A000230.
 * @author Sean A. Irvine
 */
public class A086977 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mB = 2;
  private long mMax = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long a = 2;
      while (mPrime.nextPrime(a) - a != 2 * mN) {
        a = mPrime.nextPrime(a);
      }
      if (a < mB && mB >= mMax) {
        final long res = mB;
        mB = a;
        if (mB > mMax) {
          mMax = mB;
        }
        return Z.valueOf(res);
      }
      mB = a;
      if (mB > mMax) {
        mMax = mB;
      }
    }
  }
}
