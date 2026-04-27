package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

public class A395426 extends Sequence1 {

  // After Hirotaka Sato

  private int mN = 1;
  private int mM = 0;

  public static Z t(final int n, final int k) {
    if ((long) n * k > 64) {
      throw new IllegalArgumentException();
    }
    final long total = 1L << (n * k);
    final int maxDr = n - 1;
    final int maxDc = k - 1;
    long count = 0;

    outer:
    for (long pattern = 0; pattern < total; ++pattern) {
      // only need dr <= 0 and dc <= 0
      for (int dr = -maxDr; dr <= 0; ++dr) {
        for (int dc = -maxDc; dc <= 0; ++dc) {
          if (dr == 0 && dc == 0) {
            continue;
          }
          final long translated = translateFast(pattern, n, k, dr, dc);
          if (translated != -1 && translated < pattern) {
            continue outer;
          }
        }
      }
      ++count;
    }
    return Z.valueOf(count);
  }

  private static long translateFast(long pattern, final int n, final int k, final int dr, final int dc) {
    // horizontal shift first
    if (dc < 0) {
      final int shift = -dc;
      // check left boundary: bits in first 'shift' columns must be zero
      for (int r = 0; r < n; ++r) {
        long row = (pattern >>> (r * k)) & ((1L << k) - 1);
        if ((row & ((1L << shift) - 1)) != 0) {
          return -1;
        }
      }
      // shift right
      long res = 0;
      for (int r = 0; r < n; ++r) {
        final long row = ((pattern >>> (r * k)) & ((1L << k) - 1)) >>> shift;
        res |= row << (r * k);
      }
      pattern = res;
    } else if (dc > 0) {
      for (int r = 0; r < n; ++r) {
        long row = (pattern >>> (r * k)) & ((1L << k) - 1);
        if ((row & (((1L << dc) - 1) << (k - dc))) != 0) {
          return -1;
        }
      }
      long res = 0;
      for (int r = 0; r < n; ++r) {
        final long row = (pattern >>> (r * k)) & ((1L << k) - 1);
        res |= row << (dc + r * k);
      }
      pattern = res;
    }

    // vertical shift
    if (dr < 0) {
      final int shiftRows = -dr;
      // top rows must be empty
      final long topMask = (1L << (shiftRows * k)) - 1;
      if ((pattern & topMask) != 0) {
        return -1;
      }
      return pattern >>> (shiftRows * k);
    } else if (dr > 0) {
      final long bottomMask = ((1L << (dr * k)) - 1) << ((n - dr) * k);
      if ((pattern & bottomMask) != 0) {
        return -1;
      }
      return pattern << (dr * k);
    }
    return pattern;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
