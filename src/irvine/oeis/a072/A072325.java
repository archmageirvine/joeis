package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.LongDynamicIntArray;

/**
 * A072325 Number of even numbers that cannot be expressed as the difference p-q of two odd primes q &lt; p &lt;= prime(n).
 * @author Sean A. Irvine
 */
public class A072325 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private final LongDynamicIntArray mDiff = new LongDynamicIntArray();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    for (long q = 3; q < mP; q = mPrime.nextPrime(q)) {
      final long d = mP - q;
      mDiff.increment(d / 2);
    }
    long c = 0;
    for (long k = 1; k <= (mP - 3) / 2; ++k) {
      if (mDiff.get(k) == 0) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
