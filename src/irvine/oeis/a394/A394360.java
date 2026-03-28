package irvine.oeis.a394;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394360 Smallest number which can be written as the sum of n distinct primes in at least n different ways.
 * @author Sean A. Irvine
 */
public class A394360 extends Sequence1 {

  private static final int CAP = 1000000;
  private int mN = 0;
  private final MemoryFunction1<Integer> mSumFirst = new MemoryFunction1<>() {
    @Override
    protected Integer compute(final int n) {
      return n == 0 ? 0 : get(n - 1) + Functions.PRIME.i(n);
    }
  };

  private final MemoryFunctionInt3<Integer> mF = new MemoryFunctionInt3<>() {
    @Override
    protected Integer compute(final int i, final int k, final int s) {
      if (k == 0) {
        return s == 0 ? 1 : 0;
      }
      if (i < 0 || s <= 0 || k > i + 1) {
        return 0;
      }
      if (s < mSumFirst.get(k) || s > maxSum(i, k)) {
        return 0;
      }
      final int pi = Functions.PRIME.i(i + 1); // k-th prime (1-based)
      // exclude
      int res = get(i - 1, k, s);
      // include
      if (s >= pi) {
        res += get(i - 1, k - 1, s - pi);
      }
      if (res > CAP) {
        res = CAP;
      }
      return res;
    }
  };


  private int maxSum(final int i, final int k) {
    // sum of largest k primes among first i+1 primes
    return mSumFirst.get(i + 1) - mSumFirst.get(i + 1 - k);
  }

  @Override
  public Z next() {
    if (++mN > CAP) {
      throw new UnsupportedOperationException();
    }
    if (mN == 1) {
      return Z.TWO;
    }
    int limit = 10 * mN * mN;
    while (true) {
      final int maxPrimeIndex = Functions.PRIME_PI.i(limit);
      for (int s = 0; s <= limit; ++s) {
        final int ways = mF.get(maxPrimeIndex - 1, mN, s);
        if (ways >= mN) {
          return Z.valueOf(s);
        }
      }
      limit *= 2;
    }
  }
}
