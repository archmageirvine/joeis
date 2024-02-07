package irvine.oeis.a068;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A068254 1/4 the number of colorings of an n X n square array with 4 colors.
 * @author Sean A. Irvine
 */
public class A068254 extends AbstractSequence {

  protected final int mBits;
  protected final long mMask;
  private int mN;

  protected A068254(final int offset, final int bits) {
    super(offset);
    mBits = bits;
    mMask = (1L << bits) - 1;
    mN = offset - 1;
  }

  /** Construct the sequence. */
  public A068254() {
    this(1, 2);
  }

  private boolean isLegal(final int n, long pattern) {
    long prev = -1;
    for (int k = 0; k < n; ++k) {
      if ((pattern & mMask) == prev) {
        return false;
      }
      prev = pattern & mMask;
      pattern >>>= mBits;
    }
    return true;
  }

  protected boolean isLegal(final int n, long p1, long p2) {
    for (int k = 0; k < n; ++k) {
      if ((p1 & mMask) == (p2 & mMask)) {
        return false;
      }
      p1 >>>= mBits;
      p2 >>>= mBits;
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
    if (n * (1L << mBits) >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    // 2 bits per colour
    final ArrayList<Long> patterns = new ArrayList<>();
    for (long i = 0; i < (1L << (mBits * n)); ++i) {
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
    return sum.divide(1L << mBits);
  }

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
