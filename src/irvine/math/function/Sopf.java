package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * Compute the sum of distinct prime divisors function.
 * For small values it will consult a table (which can grow as required),
 * for large specific values it will use factorization.
 * @author Sean A. Irvine
 */
public class Sopf extends AbstractFunction1 {

  private static final long INITIAL_SIZE = 1024;
  private static final long MAX_SIZE = 1L << 24;
  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mSopf = new LongDynamicLongArray();
  private long mMax = 0;

  @Override
  public long l(final long n) {
    if (n < 2) {
      return 0;
    }
    if (n >= MAX_SIZE || (n >= INITIAL_SIZE && n >= 2 * mMax)) {
      // Request value is much larger than the current table, use factorization
      return Jaguar.factor(n).sopf().longValueExact();
    }
    if (n >= mMax) {
      // We need to resize the table to accommodate n.
      // Rather than grow to exactly n, compute out to 2*n to avoid too many resize events
      final long prev = mMax - 1;
      mMax = Math.min(mMax == 0 ? INITIAL_SIZE : 2 * n, MAX_SIZE);
      for (long p = 2; p < mMax; p = mPrime.nextPrime(p)) {
        for (long j = prev + p - prev % p; j < mMax; j += p) {
          mSopf.add(j, p);
        }
      }
    }
    return mSopf.get(n);
  }

  @Override
  public Z z(final Z n) {
    return n.bitLength() < Long.SIZE ? Z.valueOf(l(n.longValue())) : Jaguar.factor(n).sopf();
  }
}
