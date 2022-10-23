package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A061150 a(n) = Sum_{d|n} d*prime(d).
 * @author Sean A. Irvine
 */
public class A061150 extends Sequence1 {

  private int mN = 0;
  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mP = new LongDynamicLongArray();
  {
    mP.set(0, 1L);
  }

  private long p(final int n) {
    while (n >= mP.length()) {
      mP.set(mP.length(), mPrime.nextPrime(mP.get(mP.length() - 1)));
    }
    return mP.get(n);
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(d.multiply(p(d.intValue())));
    }
    return sum;
  }
}
