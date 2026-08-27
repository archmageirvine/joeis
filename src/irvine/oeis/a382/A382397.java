package irvine.oeis.a382;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A382397 Minimum size of a maximal subset of {1..n} such that every pair of distinct elements has a different difference.
 * @author Sean A. Irvine
 */
public class A382397 extends Sequence0 {

  private int mN = -1;
  private int mSize;
  private int mLo;
  private int mHi;

  /**
   * Compute both extrema for the specified n.
   *
   * @param n value of n
   * @return array containing {lo, hi}
   */
  protected int[] f(final int n) {
    mSize = n;
    mLo = n + 1;
    mHi = 0;
    g(1, Z.ZERO, Z.ZERO, 0, Z.ZERO);
    return new int[] {mLo, mHi};
  }

  /**
   * Recursive computation.
   *
   * @param i current index
   * @param b current value of b
   * @param s current value of s
   * @param m current count
   * @param u current value of u
   */
  private void g(final int i, final Z b, final Z s, final int m,  final Z u) {
    if (m >= mLo && m + mSize - i + 1 <= mHi) {
      return;
    }

    if (i > mSize) {
      if (u.isZero()) {
        if (m < mLo) {
          mLo = m;
        }
        if (m > mHi) {
          mHi = m;
        }
      }
      return;
    }

    final Z e = Z.ONE.shiftLeft(i);
    final Z h = b.add(e);
    final Z v = h.multiply(e);
    final boolean t = s.and(v).isZero();

    if (t) {
      g(i + 1, b, s, m, u.or(e));
    } else {
      g(i + 1, b, s, m, u);
    }

    if (t) {
      final Z w = s.add(v);
      Z z = Z.ZERO;
      for (int x = 1; x < i; ++x) {
        final Z px = Z.ONE.shiftLeft(x);
        if (!u.and(px).isZero()) {
          final Z y = h.add(px);
          if (w.and(y.multiply(px)).isZero()) {
            z = z.or(px);
          }
        }
      }
      g(i + 1, h, w, m + 1, z);
    }
  }

  @Override
  public Z next() {
    return Z.valueOf(f(++mN)[0]);
  }
}
