package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.util.array.LongDynamicIntArray;

/**
 * Routines relating to the Mobius function.  For a limit of n this
 * implementation requires O(n/8) bytes for table storage.
 * @author Sean A. Irvine
 */
class Mobius extends AbstractFunction1 {

  /** Largest valid entry in the table. */
  private long mLimit = 1000;
  private final LongDynamicIntArray mMu = new LongDynamicIntArray();

  Mobius() {
    extend(); // Construct initial table
  }

  private int mobiusInternal(final long n) {
    return (mMu.get(n >> 4) >> (((int) n & 15) << 1)) & 3;
  }

  private void zero(final long n) {
    final long i = n >> 4;
    mMu.set(i, mMu.get(i) & (~(3 << (((int) n & 15) << 1))));
  }

  private void update(final long n) {
    final long index = n >> 4;
    final int shift = ((int) n & 15) << 1;
    final int old = mMu.get(index);
    mMu.set(index, (old & (~(3 << shift))) + ((((3 >> ((old >> shift) & 3)) + 1) & 3) << shift));
  }

  private void extend() {
    final long sqrtLimit = LongUtils.sqrt(mLimit);

    /*
     * Build a table that encodes the values of the Mobius function. The table
     * is computed using a variation on the sieve of Eratosthenes.  Two bits
     * are used to represent each value.  A bit value of 01 indicates +1, a
     * value of 10 indicates -1, and 00 a value of 0, 11 is not used in the
     * final table but is used to track untouched entries during the build.
     * It follows that each 32-bit integer encodes 16 Mobius values.  To save
     * space the table only encodes odd values, since the values of even
     * numbers can be calculated using properties of the Mobius function.
     * The first 32 bits of the table contain the values for Mobius of
     * 31, 29, ..., 5, 3, 1, in that order.
     */
    final long maxIndex = (mLimit + 31) >> 5;
    // initialize table to empty, happens to handle mu(1) correctly
    for (long k = 0; k < maxIndex; ++k) {
      mMu.set(k, -1);
    }
    for (long k = 3; k < mLimit; k += 2) {
      long j = k >> 1;
      // test for a so far untouched (i.e. prime) entry
      if (mobiusInternal(j) == 3) {
        // sieve step for k
        do {
          update(j);
          j += k;
        } while (j < mLimit);
        if (k <= sqrtLimit) {
          // sieve step for k^2
          final long ksq = k * k;
          j = ksq >> 1;
          while (j < mLimit) {
            zero(j);
            j += ksq;
          }
        }
      }
    }
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
  public Z z(final long n) {
    return Z.valueOf(i(n));
  }

  @Override
  public Z z(final Z n) {
    return Z.valueOf(i(n));
  }

  @Override
  public int i(final long n) {
    if (n >= 2 * mLimit) {
      // Resort to factorization
      return Jaguar.factor(n).mobius();
    }
    if (n >= mLimit) {
      mLimit <<= 1;
      extend();
    }
    switch ((int) n & 3) {
    case 0: // divisible by 4
      return 0;
    case 2: // divisible by 2 but not 4
      return -i(n >> 1);
    default: // was odd to start with
      return 1 - ((1 << mobiusInternal(n >> 1)) & 3);
    }
  }

  @Override
  public int i(final Z n) {
    return n.bitLength() < Long.SIZE ? i(n.longValue()) : Jaguar.factor(n).mobius();
  }
}

