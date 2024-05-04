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
  private long mMax = 2;
  {
    mPhi.set(0, 1L); // Convention
    mPhi.set(1, 1L); // Convention
  }

  @Override
  public long l(final long n) {
    if (n <= 0) {
      if (n == 0) {
        return 0;
      }
      return l(-n);
    }
    if (n >= INITIAL_SIZE && n >= 2 * mMax) {
      // Request value is much larger than the current table, use factorization
      return Jaguar.factor(n).phi().longValueExact();
    }
    if (n >= mMax) {
      // With more effort this could be made incremental
      mPhi.truncate(2);
      mMax = mMax == 0 ? INITIAL_SIZE : 2 * n;
      for (long k = 2; k < mMax; ++k) {
        if (mPhi.get(k) == 0) {
          mPhi.set(k, k - 1);
          for (long j = 2 * k; j < mMax; j += k) {
            if (mPhi.get(j) == 0) {
              mPhi.set(j, j);
            }
            mPhi.set(j, mPhi.get(j) / k * (k - 1));
          }
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
