package irvine.oeis.a067;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067967 Number of binary arrangements without adjacent 1's on n X n hexagonal staggered torus shifted for odd n.
 * @author Sean A. Irvine
 */
public class A067967 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 64) {
      throw new UnsupportedOperationException();
    }
    final ArrayList<Long> patterns = new ArrayList<>();
    for (long i = 0; i < (1L << mN); ++i) {
      if ((i & 1) == 0 || (i & (1L << (mN - 1))) == 0) {
        long j = i;
        while (j != 0 && (j & 3) != 3) {
          j >>>= 1;
        }
        if ((j & 3) != 3) {
          patterns.add(i);
        }
      }
    }
    final long[] p = LongUtils.toLong(patterns);
    // Precompute left rotations
    final long[] left = new long[p.length];
    for (int k = 0; k < p.length; ++k) {
      left[k] = (p[k] << 1) + (p[k] >>> (mN - 1));
    }
    // Precompute right rotations
    final long[] right = new long[p.length];
    for (int k = 0; k < p.length; ++k) {
      right[k] = (p[k] >>> 1) + ((p[k] & 1) << (mN - 1));
    }
    final int len = p.length;
    Z[] v = new Z[len];
    Z sum = Z.ZERO;
    for (int pos = 0; pos < v.length; ++pos) {
      Arrays.fill(v, Z.ZERO);
      v[pos] = Z.ONE;
      for (int i = 1; i < mN; ++i) {
        final Z[] w = new Z[len];
        Arrays.fill(w, Z.ZERO);
        for (int k = 0; k < len; ++k) {
          final long pk = p[k];
          for (int j = 0; j < len; ++j) {
            if ((i & 1) == 1) {
              if ((p[j] & pk) == 0 && (left[j] & pk) == 0) {
                w[k] = w[k].add(v[j]);
              }
            } else {
              if ((p[j] & pk) == 0 && (right[j] & pk) == 0) {
                w[k] = w[k].add(v[j]);
              }
            }
          }
        }
        v = w;
      }
      final long l = left[pos];
      for (int k = 0; k < len; ++k) {
        if ((p[k] & p[pos]) == 0 && (p[k] & l) == 0) {
          sum = sum.add(v[k]);
        }
      }
    }
    return sum;
  }
}
