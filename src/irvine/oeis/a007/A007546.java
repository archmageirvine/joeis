package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A007546 Number of steps to compute n-th prime in PRIMEGAME (fast version).
 * @author Sean A. Irvine
 */
public class A007546 extends MemorySequence {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mP = new LongDynamicLongArray();
  private long mPP = 1;

  {
    setOffset(1);
    add(null);
    mP.set(0, 0);
  }

  private long p(final long n) {
    while (n >= mP.length()) {
      mPP = mPrime.nextPrime(mPP);
      mP.set(mP.length(), mPP);
    }
    return mP.get(n);
  }

  private Z f(final long n) {
    final Z[] divisors = Jaguar.factor(n).divisorsSorted();
    final long b = divisors[divisors.length - 2].longValue();
    Z sum = Z.ZERO;
    for (long d = b; d < n; ++d) {
      sum = sum.add(n / d);
    }
    sum = sum.multiply2();
    return sum.add(n - 1).add(Z.valueOf(n - b).multiply(6 * n + 2));
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return f(2);
    }
    Z sum = a(n - 1);
    for (long i = p(n - 1) + 1; i <= p(n); ++i) {
      sum = sum.add(f(i));
    }
    return sum;
  }
}
