package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * Compute the Euler totient function.
 * For small values it will consult a table (which can grow as required),
 * for large specific values it will use factorization.
 * @author Sean A. Irvine
 */
public class Phi extends AbstractFunction1 {

  private static final long INITIAL_SIZE = 1024;
  private final LongDynamicLongArray mPhi = new LongDynamicLongArray();
  private long mMax = 0;
  {
    mPhi.set(0, 1L); // Convention
  }

  @Override
  public long l(final long n) {
    if (n <= 0) {
      if (n == 0) {
        return 0;
      }
      return l(-n);
    }
    if (n >= 2 * mMax) {
      // Request value is much larger than the current table, use factorization
      return Jaguar.factor(n).phi().longValueExact();
    }
    if (n >= mMax) {
      // We need to resize the table to accommodate n.
      // Rather than grow to exactly n, compute out to 2*n to avoid too many resize events
      for (long k = mMax; k < 2 * mMax; ++k) {
        mPhi.set(k, k);
      }
      final long prev = mMax - 1;
      mMax = mMax == 0 ? INITIAL_SIZE : 2 * n;
      for (long k = 1; k < mMax; ++k) {
        final long pd = -mPhi.get(k);
        for (long j = prev + 2 * k - prev % k; j < mMax; j += k) {
          mPhi.add(j, pd);
        }
      }
    }
    return mPhi.get(n);
  }

  @Override
  public Z z(final Z n) {
    return n.bitLength() < Long.SIZE ? Z.valueOf(l(n.longValue())) : Jaguar.factor(n.abs()).phi();
  }
}
