package irvine.factor.gnfs;

import irvine.math.PopCount;

/**
 * Some utility functions related to the Lanczos procedure.
 * @author Sean A. Irvine
 */
public final class LanczosUtils {

  private LanczosUtils() { }

  // Count the number of bit-columns in v which are nonzero
  static int countNonZeroCols(final long[] v, final int len) {
    // This implementation by SAI
    long or = 0;
    for (int k = 0; k < len; ++k) {
      or |= v[k];
      if (or == -1) {
        return 64; // every column is nonzero, quick exit
      }
    }
    return (int) PopCount.popcount(or);

    // Slight tweak on original Franke implementation
    /*
    int nonzero = 0;
    for (long j = 1L << 63; j != 0; j >>>= 1) {
      boolean okay = false;
      for (int i = 0; i < len; ++i) {
        if ((v[i] & j) != 0) {
          okay = true;
          break;
        }
      }
      if (okay) {
        ++nonzero;
      }
    }
    return nonzero;
    */
  }

  static long toMask(final int col) {
    return 1L << (~col & 63);
  }

  // Find the first non-zero entry of an array subject to a mask.
  static int getFirstNonZeroIndex(final long[] v, final int len, final long mask) {
    for (int k = 0; k < len; ++k) {
      if ((v[k] & mask) != 0) {
        return k;
      }
    }
    return -1;
  }

  // Perform bit-wise column addition hp2:col2 += hp1:col1
  static void columnAdd(final long[] hp1, final long[] hp2, final int len, final int col1, final int col2) {
    if (col1 == col2) {
      return;
    }
    final long ma1 = toMask(col1);
    final long ma2 = toMask(col2);
    //final long ma1 = 1L << (63 - (col1 & 63));
    //final long ma2 = 1L << (63 - (col2 & 63));
    for (int k = 0; k < len; ++k) {
      if ((hp1[k] & ma1) != 0) {
        hp2[k] ^= ma2;
      }
    }
  }

  // Perform bit-wise column swap hp1:col1 <-> hp2:col2
  static void columnExchange(final long[] hp1, final long[] hp2, final int len, final int nr1, final int nr2) {
    if (nr1 == nr2) {
      return;
    }
    final long ma1 = LanczosUtils.toMask(nr1);
    final long ma2 = LanczosUtils.toMask(nr2);
    for (int k = 0; k < len; ++k) {
      final boolean bit1 = (hp1[k] & ma1) != 0;
      final boolean bit2 = (hp2[k] & ma2) != 0;
      if ((bit1 && !bit2) || (!bit1 && bit2)) {
        hp1[k] ^= ma1;
        hp2[k] ^= ma2;
      }
    }
  }

  static boolean isZero(final long[] m) {
    for (final long e : m) {
      if (e != 0L) {
        return false;
      }
    }
    return true;
  }
}
