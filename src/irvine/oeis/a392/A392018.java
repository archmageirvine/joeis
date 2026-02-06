package irvine.oeis.a392;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.DynamicLongArray;

/**
 * A392018 Least prime p such that the sum of consecutive primes ending at p sums to a power of n &gt; 1.
 * @author Sean A. Irvine
 */
public class A392018 extends Sequence2 {

  private final Fast mFast = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    final DynamicLongArray sums = new DynamicLongArray();
    while (true) {
      p = mFast.nextPrime(p);
      for (int k = 0; k < sums.length(); ++k) {
        sums.add(k, p);
      }
      sums.set(sums.length(), p);
      long t = mN;
      for (int k = sums.length(); k >= 0; --k) {
        final long s = sums.get(k);
        while (s > t) {
          t *= mN;
        }
        if (s == t) {
          return Z.valueOf(p);
        }
      }
    }
  }
}
