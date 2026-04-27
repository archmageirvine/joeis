package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A395255 a(n) = number of triples (x, y, z) such that x^2 + y*z = n, where x, y, z are primes satisfying x &lt;= y &lt;= z.
 * @author Sean A. Irvine
 */
public class A395255 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mPrime.isPrime(mN)) {
      for (long y = 2; y <= mN; y = mPrime.nextPrime(y)) {
        for (long x = 2; x <= y; x = mPrime.nextPrime(x)) {
          mCounts.increment(x * x + y * mN);
        }
      }
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
