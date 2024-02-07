package irvine.oeis.a068;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068255 1/5 the number of colorings of an n X n square array with 5 colors.
 * @author Sean A. Irvine
 */
public class A068255 extends Sequence1 {

  // Note A068254 is slightly faster implementation style for power of two colors

  protected final int mColors;
  private int mN = 0;

  protected A068255(final int colors) {
    mColors = colors;
  }

  /** Construct the sequence. */
  public A068255() {
    this(5);
  }

  private boolean isLegal(final int n, long pattern) {
    long prev = -1;
    for (int k = 0; k < n; ++k) {
      if ((pattern % mColors) == prev) {
        return false;
      }
      prev = pattern % mColors;
      pattern /= mColors;
    }
    return true;
  }

  protected boolean isLegal(final int n, long p1, long p2) {
    for (int k = 0; k < n; ++k) {
      if (p1 % mColors == p2 % mColors) {
        return false;
      }
      p1 /= mColors;
      p2 /= mColors;
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
    final ArrayList<Long> patterns = new ArrayList<>();
    final long lim = Z.valueOf(mColors).pow(n).longValueExact(); // will exception if too large for this implementation
    for (long i = 0; i < lim; ++i) {
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
    return sum.divide(mColors);
  }

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
