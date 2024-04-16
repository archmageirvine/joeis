package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.util.array.LongDynamicIntArray;

/**
 * Compute the number of prime divisors function.
 * For small values it will consult a table (which can grow as required),
 * for large specific values it will use factorization.
 * @author Sean A. Irvine
 */
public class Omega extends AbstractFunction1 {

  private static final long INITIAL_SIZE = 1024;
  private final Fast mPrime = new Fast();
  private final LongDynamicIntArray mOmega = new LongDynamicIntArray();
  private long mMax = 0;

  @Override
  public long l(final long n) {
    return i(n);
  }

  @Override
  public int i(final long n) {
    if (n < 2) {
      return 0;
    }
    if (n >= 2 * mMax) {
      // Request value is much larger than the current table, use factorization
      return Jaguar.factor(n).omega();
    }
    if (n >= mMax) {
      // We need to resize the table to accommodate n.
      // Rather than grow to exactly n, compute out to 2*n to avoid too many resize events
      final long prev = mMax - 1;
      mMax = mMax == 0 ? INITIAL_SIZE : 2 * n;
      for (long k = 2; k < mMax; k = mPrime.nextPrime(k)) {
        for (long j = prev + k - prev % k; j < mMax; j += k) {
          mOmega.increment(j);
        }
      }
    }
    return mOmega.get(n);
  }

  @Override
  public Z z(final Z n) {
    if (n.signum() < 0) {
      return Z.ZERO;
    }
    return Z.valueOf(n.bitLength() < Long.SIZE ? i(n.longValue()) : Jaguar.factor(n).omega());
  }
}
