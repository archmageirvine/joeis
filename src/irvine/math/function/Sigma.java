package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * Compute the sum of divisors function.
 * For small values it will consult a table (which can grow as required),
 * for large specific values it will use factorization.
 * @author Sean A. Irvine
 */
public class Sigma extends AbstractFunction1 {

  private static final long INITIAL_SIZE = 1024;
  private static final long MAX_SIZE = 1L << 24;
  private final LongDynamicLongArray mSigma = new LongDynamicLongArray();
  private long mMax = 0;
  {
    mSigma.set(0, 1L); // Convention
  }

  @Override
  public long l(final long n) {
    if (n < 0) {
      return 0;
    }
    if (n >= MAX_SIZE || (n >= INITIAL_SIZE && n >= 2 * mMax)) {
      // Request value is much larger than the current table, use factorization
      return Jaguar.factor(n).sigma().longValueExact();
    }
    if (n >= mMax) {
      // We need to resize the table to accommodate n.
      // Rather than grow to exactly n, compute out to 2*n to avoid too many resize events
      final long prev = mMax - 1;
      mMax = Math.min(mMax == 0 ? INITIAL_SIZE : 2 * n, MAX_SIZE);
      for (long k = 1; k < mMax; ++k) {
        for (long j = prev + k - prev % k; j < mMax; j += k) {
          mSigma.add(j, k);
        }
      }
    }
    return mSigma.get(n);
  }

  @Override
  public Z z(final Z n) {
    if (n.signum() < 0) {
      return Z.ZERO;
    }
    // Note sigma(n) can exceed n
    return n.bitLength() < Long.SIZE - 2 ? Z.valueOf(l(n.longValue())) : Jaguar.factor(n).sigma();
  }
}
