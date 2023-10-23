package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066484 Numbers with at least 2 distinct digits and whose "rotations" (including the number itself) are multiples of these digits; repeated digits allowed but digit 0 not allowed.
 * @author Sean A. Irvine
 */
public class A066484 extends Sequence1 {

  private long mN = 1112;

  private boolean is(long n, final long[] d, final int length) {
    final long m = LongUtils.pow(10, length - 1);
    for (int k = 0; k < length; ++k) {
      for (final long v : d) {
        if (n % v != 0) {
          return false;
        }
      }
      // Rotate
      n = (n / 10) + (n % 10) * m;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final int[] cnts = ZUtils.digitCounts(++mN);
      if (cnts[0] == 0) {
        int numDistinctDigits = 0;
        for (final int c : cnts) {
          if (c > 0) {
            ++numDistinctDigits;
          }
        }
        if (numDistinctDigits > 1) {
          int length = 0;
          final long[] d = new long[numDistinctDigits];
          for (int k = 1, j = 0; k < cnts.length; ++k) {
            if (cnts[k] > 0) {
              length += cnts[k];
              d[j++] = k;
            }
          }
          if (is(mN, d, length)) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

