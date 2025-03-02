package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A075616.
 * @author Sean A. Irvine
 */
public class A075635 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long[] mA = {1};
  private int mM = -1;
  private long mS = 4;
  {
    mUsed.set(1);
  }

  @Override
  public Z next() {
    if (++mM >= mA.length) {
      mA = new long[mA.length + 1];
      final int n = mA.length;
      mM = 0;
      long k = mS;
      long sum = 0;
      for (int j = 0; j < n - 1; ++j) {
        while (mUsed.isSet(k) || mPrime.isPrime(k)) {
          ++k;
        }
        sum += k;
        mUsed.set(k);
        mA[j] = k++;
      }
      while (true) {
        while (mUsed.isSet(k) || mPrime.isPrime(k)) {
          ++k;
        }
        if (mPrime.isPrime(sum + k)) {
          mUsed.set(k);
          mA[mA.length - 1] = k;
          break;
        }
        ++k;
      }
      while (mUsed.isSet(mS) || mPrime.isPrime(mS)) {
        ++mS;
      }
    }
    return Z.valueOf(mA[mM]);
  }
}
