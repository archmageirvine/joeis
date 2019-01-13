package irvine.nt.mobius;

import irvine.math.LongUtils;
import irvine.util.array.LongDynamicIntArray;

/**
 * Routines relating to the Mobius function.  For a limit of n this
 * implementation requires O(n/8) bytes for table storage.
 *
 * @author Sean A. Irvine
 */
public class Mobius {

  /** Longest valid entry in the table. */
  private final long mLimit;
  /** The table. */
  private final LongDynamicIntArray mMu;

  /** Three functions used internally for table construction. */
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
    mMu.set(index, (old & (~(3 << shift)))
            + ((((3 >> ((old >> shift) & 3)) + 1) & 3) << shift));
  }

  /**
   * Construct a new table of Mobius values up to the given limit.  Extends the
   * usual definition by defining mu(0)=0.
   *
   * @param limit largest Mobius value this instance can handle.
   */
  public Mobius(final long limit) {
    if (limit < 0) {
      throw new ArithmeticException("Limit must be nonnegative.");
    }
    mLimit = limit + 1;
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
    mMu = new LongDynamicIntArray();
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

  /**
   * Return the Mobius function evaluated at <code>n</code>.
   *
   * @param n value to get the Mobius function of
   * @return mu(n)
   * @exception ArithmeticException if argument is too large or negative.
   */
  public int mobiusMu(final long n) {
    if (n >= mLimit || n < 0) {
      throw new ArithmeticException("Out of range.");
    }
    switch ((int) n & 3) {
    case 0: // divisible by 4
      return 0;
    case 2: // divisible by 2 but not 4
      return -mobiusMu(n >> 1);
    default: // was odd to start with
      return 1 - ((1 << mobiusInternal(n >> 1)) & 3);
    }
  }

  /**
   * Compute the Mertens function of n.  That is, the sum of the Mobius
   * function from 1 to n inclusive.
   *
   * @param n argument
   * @return M(n)
   * @exception ArithmeticException if argument is invalid.
   */
  public long mertens(final long n) {
    if (n <= 0) {
      throw new ArithmeticException("Out of range.");
    }
    long mertens = 1;
    for (long k = 2; k <= n; ++k) {
      mertens += mobiusMu(k);
    }
    return mertens;
  }

  private static Mobius sMobius = null;
  private static long sMobiusLimit = 0;

  /**
   * Return the Mobius function evaluated at <code>n</code>.
   *
   * @param n value to get the Mobius function of
   * @return mu(n)
   * @exception ArithmeticException if argument is negative.
   */
  public static int mobius(final long n) {
    if (n >= sMobiusLimit) {
      if (sMobiusLimit == 0) {
        sMobiusLimit = Math.max(n, 1024);
      } else {
        do {
          sMobiusLimit <<= 1;
        } while (sMobiusLimit <= n);
      }
      sMobius = new Mobius(sMobiusLimit);
    }
    return sMobius.mobiusMu(n);
  }

  /**
   * Print the Mertens function evaluated at the given value.
   *
   * @param args value to evaluate at
   */
  public static void main(final String[] args) {
    final long x = Long.parseLong(args[0]);
    final Mobius m = new Mobius(x + 1);
    System.out.println(m.mertens(x));
  }
}

