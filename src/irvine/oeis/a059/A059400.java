package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;

/**
 * A059400 a(n) is the least odd number of the form p + k^2 with p prime and k &gt; 0 which can be represented in exactly n different ways.
 * @author Sean A. Irvine
 */
public class A059400 extends Sequence0 {

  private final DynamicLongArray mA = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private int mN = -1;
  private long mM = -1;

  private int count(final long n) {
    int c = 0;
    for (long k = 1; k * k < n; ++k) {
      if (mPrime.isPrime(n - k * k)) {
        ++c;
      }
    }
    return c;
  }

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      mM += 2;
      final int c = count(mM);
      if (mA.get(c) == 0) {
        mA.set(c, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
