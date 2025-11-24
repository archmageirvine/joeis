package irvine.oeis.a082;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082011 Square array read by antidiagonals, alternating upwards and downwards: T(1,1) = 2 and every other entry is the smallest prime not already used such that the n-th antidiagonal sum is a multiple of n.
 * @author Sean A. Irvine
 */
public class A082011 extends Sequence1 {

  // After Alois Heinz

  private final HashSet<Long> mUsedPrimes = new HashSet<>();
  private final Fast mPrime = new Fast();
  private long mLeastUnusedPrime = 3;
  private int mN = 0;
  private int mM = 0;
  protected final MemoryFunctionInt2<Z> mT = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 1 && k == 1) {
        return Z.TWO;
      }
      if (n < 1 || k < 1) {
        return Z.ZERO;
      }
      final int h = 1 - 2 * ((n + k) & 1);
      final int m = n + k - 1;
      Z l = Z.ZERO;
      for (int j = 1; j < m; ++j) {
        l = l.add(get(n + h * j, k - h * j));
      }
      while (mUsedPrimes.remove(mLeastUnusedPrime)) {
        mLeastUnusedPrime = mPrime.nextPrime(mLeastUnusedPrime);
      }
      long t = mLeastUnusedPrime;
      while (mUsedPrimes.contains(t)
        || (h == 1 && ((n == 2 && Functions.GCD.l(l.add(t), m) > 1) || (n == 1 && l.add(t).mod(m) != 0)))
        || (h == -1 && ((k == 2 && Functions.GCD.l(l.add(t), m) > 1) || (k == 1 && l.add(t).mod(m) != 0)))) {
        t = mPrime.nextPrime(t);
      }
      mUsedPrimes.add(t);
      return Z.valueOf(t);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return (mN & 1) == 1 ? mT.get(1 + mN - mM, mM) : mT.get(mM, 1 + mN - mM);
  }
}

