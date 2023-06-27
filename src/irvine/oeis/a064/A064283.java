package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A064283 Least number which may be expressed as the sum of a prime number (A000040) and a nonzero square (A000290) in just n different ways.
 * @author Sean A. Irvine
 */
public class A064283 extends Sequence1 {

  private final DynamicLongArray mFirst = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private long mM = 1;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirst.get(mN) == 0) {
      ++mM;
      int cnt = 0;
      long k = 0;
      long s;
      while ((s = ++k * k) < mM) {
        if (mPrime.isPrime(mM - s)) {
          ++cnt;
        }
      }
      if (mFirst.get(cnt) == 0) {
        mFirst.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirst.get(mN));
  }
}
