package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A395623 Infinite square array where the n-th row lists the starting points of runs of n consecutive primes with same digit sum; read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A395623 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final DynamicLongArray mA = new DynamicLongArray();
  private int mN = 0;
  private int mM = 0;

  private Z t(final int n) {
    long p = mA.get(n);
    while (true) {
      p = mPrime.nextPrime(p);
      long q = p;
      final long s = Functions.DIGIT_SUM.l(q);
      int cnt = 0;
      do {
        if (++cnt >= n) {
          mA.set(n, p);
          return Z.valueOf(p);
        }
        q = mPrime.nextPrime(q);
      } while (Functions.DIGIT_SUM.l(q) == s);
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mM);
  }
}
