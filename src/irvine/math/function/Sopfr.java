package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * Compute the sum of prime divisors function (including multiplicity).
 * For small values it will consult a table (which can grow as required),
 * for large specific values it will use factorization.
 * @author Sean A. Irvine
 */
public class Sopfr extends AbstractFunction1 {

  private static final long INITIAL_SIZE = 1024;
  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mSopfr = new LongDynamicLongArray();
  private long mMax = 0;

  @Override
  public long l(final long n) {
    if (n < 2) {
      return 0;
    }
    if (n >= INITIAL_SIZE && n >= 2 * mMax) {
      // Request value is much larger than the current table, use factorization
      return Jaguar.factor(n).sopfr().longValueExact();
    }
    if (n >= mMax) {
      // We need to resize the table to accommodate n.
      // Rather than grow to exactly n, compute out to 2*n to avoid too many resize events
      final long prev = mMax - 1;
      mMax = mMax == 0 ? INITIAL_SIZE : 2 * n;
      for (long p = 2; p < mMax; p = mPrime.nextPrime(p)) {
        for (long q = p; q < mMax; q *= p) {
          for (long j = prev + q - prev % q; j < mMax; j += q) {
            mSopfr.add(j, p);
          }
        }
      }
    }
    return mSopfr.get(n);
  }

  @Override
  public Z z(final Z n) {
    return n.bitLength() < Long.SIZE ? Z.valueOf(l(n.longValue())) : Jaguar.factor(n).sopfr();
  }
}
