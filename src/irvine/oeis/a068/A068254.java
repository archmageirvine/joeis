package irvine.oeis.a068;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006506.
 * @author Sean A. Irvine
 */
public class A068254 extends Sequence1 {

  private int mN = 0;

  private boolean isLegal(final int n, long pattern) {
    long prev = -1;
    for (int k = 0; k < n; ++k) {
      if ((pattern & 3) == prev) {
        return false;
      }
      prev = pattern & 3;
      pattern >>>= 2;
    }
    return true;
  }

  private boolean isLegal(final int n, long p1, long p2) {
    for (int k = 0; k < n; ++k) {
      if ((p1 & 3) == (p2 & 3)) {
        return false;
      }
      p1 >>>= 2;
      p2 >>>= 2;
    }
    return true;
  }

  private int[][] legalTransitions(final int n, final long[] p) {
    final int[][] trans = new int[p.length][];
    for (int k = 0; k < p.length; ++k) {
      final ArrayList<Integer> ok = new ArrayList<>();
      for (int j = 0; j < p.length; ++j) {
        if (isLegal(n, p[k], p[j])) {
          ok.add(j);
        }
      }
      trans[k] = IntegerUtils.toInt(ok);
    }
    return trans;
  }

  protected Z t(final int n, final int m) {
    if (m < n) {
      return t(m, n);
    }
    if (n > 31) {
      throw new UnsupportedOperationException();
    }
    // 2 bits per colour
    final ArrayList<Long> patterns = new ArrayList<>();
    for (long i = 0; i < (1L << (2 * n)); ++i) {
      if (isLegal(n, i)) {
        patterns.add(i);
      }
    }
    final int len = patterns.size();
    final long[] p = LongUtils.toLong(patterns);
    final int[][] transitions = legalTransitions(n, p);
    Z[] v = new Z[len];
    Arrays.fill(v, Z.ONE);
    for (int i = 1; i < m; ++i) {
      final Z[] w = new Z[len];
      Arrays.fill(w, Z.ZERO);
      for (int j = 0; j < len; ++j) {
        for (final int k : transitions[j]) {
          w[j] = w[j].add(v[k]);
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

  @Override
  public Z next() {
    if (++mN > 31) {
      throw new UnsupportedOperationException();
    }
    return t(mN, mN).divide(4);
  }
}
