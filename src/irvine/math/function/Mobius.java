package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.util.array.LongDynamicByteArray;

/**
 * Mobius function.
 * For small values it will consult a table (which can grow as required),
 * for large specific values it will use factorization.
 * @author Sean A. Irvine
 */
class Mobius extends AbstractFunction1 {

  private static final long INITIAL_SIZE = 1024;
  private static final long MAX_SIZE = 1L << 24;
  private final Fast mPrime = new Fast();
  private final LongDynamicByteArray mMu = new LongDynamicByteArray();
  private long mMax = 1;

  @Override
  public int i(final long n) {
    if ((n & 3) == 0) {
      return 0; // trivially divisible by 4
    }
    if (n >= MAX_SIZE || (n >= INITIAL_SIZE && n >= 2 * mMax)) {
      // Request value is much larger than the current table, use factorization
      return Jaguar.factor(n).mobius();
    }
    if (n >= mMax) {
      // We need to resize the table to accommodate n.
      // Rather than grow to exactly n, compute out to 2*n to avoid too many resize events
      final long prev = mMax - 1;
      mMax = Math.min(mMax == 1 ? INITIAL_SIZE : 2 * n, MAX_SIZE);
      for (long k = prev + 1; k < mMax; ++k) {
        mMu.set(k, (byte) 1);
      }
      for (long p = 2; p < mMax; p = mPrime.nextPrime(p)) {
        for (long j = prev + p - prev % p; j < mMax; j += p) {
          mMu.negate(j);
        }
        for (long q = p * p; q < mMax; q *= p) {
          for (long j = prev + q - prev % q; j < mMax; j += q) {
            mMu.set(j, (byte) 0);
          }
        }
      }
    }
    return mMu.get(n);
  }

  @Override
  public long l(final long n) {
    return i(n);
  }

  @Override
  public long l(final Z n) {
    return i(n);
  }

  @Override
  public int i(final Z n) {
    if (n.and(Z.THREE).isZero()) {
      return 0; // Divisible by 4
    }
    return n.bitLength() < Long.SIZE ? i(n.longValue()) : Jaguar.factor(n).mobius();
  }

  @Override
  public Z z(final long n) {
    return Z.valueOf(i(n));
  }

  @Override
  public Z z(final Z n) {
    return Z.valueOf(i(n));
  }
}

