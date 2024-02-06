package irvine.oeis.a067;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067965 Number of binary arrangements without adjacent 1's on n X n array connected ne-sw and nw-se.
 * @author Sean A. Irvine
 */
public class A067965 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final ArrayList<Long> patterns = new ArrayList<>();
    for (long i = 0; i < (1L << mN); ++i) {
      patterns.add(i);
    }
    final long[] p = LongUtils.toLong(patterns);
    // Precompute left rotations
    final long[] left = new long[p.length];
    for (int k = 0; k < p.length; ++k) {
      left[k] = p[k] << 1;
    }
    // Precompute right rotations
    final long[] right = new long[p.length];
    for (int k = 0; k < p.length; ++k) {
      right[k] = p[k] >>> 1;
    }
    final int len = p.length;
    Z[] v = new Z[len];
    Arrays.fill(v, Z.ONE);
    for (int i = 1; i < mN; ++i) {
      final Z[] w = new Z[len];
      Arrays.fill(w, Z.ZERO);
      for (int k = 0; k < len; ++k) {
        for (int j = 0; j < len; ++j) {
          if ((p[j] & left[k]) == 0 && (p[j] & right[k]) == 0) {
            w[k] = w[k].add(v[j]);
          }
        }
      }
      v = w;
    }
    Z sum = Z.ZERO;
    for (final Z z : v) {
      sum = sum.add(z);
    }
    return sum;
  }
}
