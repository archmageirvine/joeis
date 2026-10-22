package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086978 Increasing peaks in the prime gap sequence A001632.
 * @author Sean A. Irvine
 */
public class A086978 extends Sequence1 {

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
        final long res = mB + 2 * mN - 2;
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
