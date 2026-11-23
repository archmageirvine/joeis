package irvine.math.turing;

import irvine.math.z.Z;

/**
 * Finite-horizon Antihydra iteration.
 * @author Gregory Morse
 */
public final class Antihydra {

  private static final int BITS = 12;
  private static final int SIZE = 1 << BITS;
  private static final long MULTIPLIER = 531441; // 3^12
  private static final int[] END = new int[SIZE];
  private static final int[] CHANGE = new int[SIZE];
  private static final int[] MINIMUM = new int[SIZE];

  static {
    for (int r = 0; r < SIZE; ++r) {
      int x = r;
      int b = 0;
      for (int j = 0; j < BITS; ++j) {
        b += (x & 1) == 0 ? 2 : -1;
        MINIMUM[r] = Math.min(MINIMUM[r], b);
        x += x / 2;
      }
      END[r] = x;
      CHANGE[r] = b;
    }
  }

  private Antihydra() { }

  private static long carry(final long q, final long product, final long sum) {
    return Math.multiplyHigh(q, MULTIPLIER) + (q < 0 ? MULTIPLIER : 0)
      + (Long.compareUnsigned(sum, product) < 0 ? 1 : 0);
  }

  private static int shortHalt(final long start, final int limit) {
    // The value is below 2^63*(3/2)^320 < 2^256, so four words suffice.
    long x0 = start;
    long x1 = 0;
    long x2 = 0;
    long x3 = 0;
    int b = 0;
    int t = 0;
    while (t < limit && b < limit - t) {
      int r = (int) x0 & (SIZE - 1);
      if (t <= limit - BITS && b + MINIMUM[r] >= 0) {
        final long q0 = (x0 >>> BITS) | (x1 << (64 - BITS));
        final long p0 = q0 * MULTIPLIER;
        x0 = p0 + END[r];
        final long c0 = carry(q0, p0, x0);
        if ((x1 | x2 | x3 | c0) != 0) {
          final long q1 = (x1 >>> BITS) | (x2 << (64 - BITS));
          final long p1 = q1 * MULTIPLIER;
          x1 = p1 + c0;
          final long c1 = carry(q1, p1, x1);
          if ((x2 | x3 | c1) != 0) {
            final long q2 = (x2 >>> BITS) | (x3 << (64 - BITS));
            final long p2 = q2 * MULTIPLIER;
            x2 = p2 + c1;
            x3 = (x3 >>> BITS) * MULTIPLIER + carry(q2, p2, x2);
          }
        }
        b += CHANGE[r];
        t += BITS;
      } else {
        for (int j = 0; j < BITS && t < limit; ++j) {
          ++t;
          b += (r & 1) == 0 ? 2 : -1;
          if (b < 0) {
            return t;
          }
          r += r / 2;
        }
      }
    }
    return 0;
  }

  /**
   * Find the first negative balance within the given number of steps.
   * @param start initial nonnegative value on the tape
   * @param limit maximum number of steps
   * @return the halting time, or zero if it does not halt within the limit
   */
  public static int haltingTime(final long start, final int limit) {
    if (start < 0 || limit < 0 || limit > Integer.MAX_VALUE / 2) {
      throw new IllegalArgumentException();
    }
    if (limit <= 320) {
      return shortHalt(start, limit);
    }
    Z a = Z.valueOf(start);
    int b = 0;
    int t = 0;
    while (t < limit && b < limit - t) {
      int r = a.intValue() & (SIZE - 1);
      if (t <= limit - BITS && b + MINIMUM[r] >= 0) {
        // For F(x) = x + floor(x/2), every parity in the next BITS steps
        // depends only on r. Moreover F^BITS(2^BITS q + r) = 3^BITS q + END[r].
        a = a.shiftRight(BITS).multiply(MULTIPLIER).add(END[r]);
        b += CHANGE[r];
        t += BITS;
      } else {
        // The known parity block either contains the halt or reaches limit.
        for (int j = 0; j < BITS && t < limit; ++j) {
          ++t;
          b += (r & 1) == 0 ? 2 : -1;
          if (b < 0) {
            return t;
          }
          r += r / 2;
        }
      }
    }
    return 0;
  }
}
