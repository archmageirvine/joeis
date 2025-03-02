package irvine.oeis.a075;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075616.
 * @author Sean A. Irvine
 */
public class A075639 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Long> mUsed = new TreeSet<>();
  private long[] mA = {1};
  private int mM = -1;
  private long mS = 2;

  @Override
  public Z next() {
    if (++mM >= mA.length) {
      mA = new long[mA.length + 1];
      final int n = mA.length;
      mM = 0;
      long k = mS;
      long sum = 0;
      for (int j = 0; j < n - 1; ++j) {
        while (mUsed.contains(k)) {
          k = mPrime.nextPrime(k);
        }
        sum += k;
        mUsed.add(k);
        mA[j] = k;
        k = mPrime.nextPrime(k);
      }
      while (true) {
        while (mUsed.contains(k)) {
          k = mPrime.nextPrime(k);
        }
        if (!mPrime.isPrime(sum + k)) {
          mUsed.add(k);
          mA[mA.length - 1] = k;
          break;
        }
        k = mPrime.nextPrime(k);
      }
      while (mUsed.remove(mS)) {
        mS = mPrime.nextPrime(mS);
      }
    }
    return Z.valueOf(mA[mM]);
  }
}
