package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A002147 Largest prime == 7 mod 8 with class number 2n+1.
 * @author Sean A. Irvine
 */
public class A002147 implements Sequence {

  // This code is not provably correct -- it only searches up to 10 times
  // the previous limit, but will abort if an error is detected.

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mBiggest = new LongDynamicLongArray();
  private int mN = -1;
  private long mP = 5;

  @Override
  public Z next() {
    ++mN;
    while (mP < 10 * (mBiggest.get(mN) + 1)) {
      mP = mPrime.nextPrime(mP);
      if ((mP & 7) == 7) {
        final long cn = LongUtils.classNumber(-mP) / 2;
        if (cn < mN) {
          throw new RuntimeException("Earlier term for " + cn + " is incorrect!");
        }
        mBiggest.set(cn, mP);
      }
    }
    return Z.valueOf(mBiggest.get(mN));
  }
}
