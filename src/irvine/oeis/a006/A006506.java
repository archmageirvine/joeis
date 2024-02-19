package irvine.oeis.a006;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006506 Number of n X n binary matrices with no 2 adjacent 1's, or number of configurations of non-attacking princes on an n X n board, where a "prince" attacks the four adjacent (non-diagonal) squares. Also number of independent vertex sets in an n X n grid.
 * @author Sean A. Irvine
 */
public class A006506 extends Sequence0 {

  // After Robert Gerbicz

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    final ArrayList<Long> patterns = new ArrayList<>();
    for (long i = 0; i < (1L << mN); ++i) {
      long j = i;
      while (j != 0 && (j & 3) != 3) {
        j /= 2;
      }
      if ((j & 3) != 3) {
        patterns.add(i);
      }
    }
    final int len = patterns.size();
    final long[] p = LongUtils.toLong(patterns);
    Z[] v = new Z[len];
    Arrays.fill(v, Z.ONE);
    for (int i = 1; i < mN; ++i) {
      final Z[] w = new Z[len];
      Arrays.fill(w, Z.ZERO);
      for (int j = 0; j < len; ++j) {
        for (int k = 0; k < len; ++k) {
          if ((p[j] & p[k]) == 0) {
            w[j] = w[j].add(v[k]);
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
