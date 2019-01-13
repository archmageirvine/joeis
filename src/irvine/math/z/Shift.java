package irvine.math.z;

/**
 * Shifts.
 *
 * @author Sean A. Irvine
 */
final class Shift {

  private Shift() { }

  /**
   * Perform a left shift on this integer.  Conceptually does
   * <code>this &lt;&lt; k</code> for <code>k&gt;=0</code>.
   * For <code>k&lt;0</code> calls <code>shiftRight(-k)</code>.
   *
   * @param n number to shift
   * @param k shift
   * @return integer left-shifted by <code>k</code>.
   */
  static Z shiftLeft(final Z n, final int k) {
    if (n.getSize() == 0) {
      return n;
    }
    if (k <= 1) {
      if (k == 0) {
        return n;
      }
      if (k == 1) {
        return n.multiply2();
      }
      return shiftRight(n, -k);
    }
    final int sa = n.getSize() < 0 ? -n.getSize() : n.getSize();
    int big = k / Z.BASE_BITS;
    final int l = sa + big;
    final int small = k - big * Z.BASE_BITS;
    if (small != 0) {
      final int[] d = new int[l + 1];
      final int c = Z.BASE_BITS - small;
      d[l] = n.mValue[sa - 1] >>> c;
      for (int i = sa - 1; i > 0; --i) {
        d[i + big] = ((n.mValue[i] << small) & Z.BASE_MASK) + (n.mValue[i - 1] >>> c);
      }
      d[big] = (n.mValue[0] << small) & Z.BASE_MASK;
      if (d[sa + big] != 0) {
        ++big;
      }
      return new Z(d, n.getSize() > 0 ? n.getSize() + big : n.getSize() - big);
    } else {
      // exact multiple of BASE_BITS
      final int[] d = new int[l];
      System.arraycopy(n.mValue, 0, d, big, sa);
      return new Z(d, n.getSize() > 0 ? n.getSize() + big : n.getSize() - big);
    }
  }

  /**
   * Perform a right shift on this integer.  Conceptually does
   * <code>this &gt;&gt; k</code> for <code>k&gt;=0</code>.
   * For <code>k&lt;0</code> calls <code>shiftLeft(-k)</code>.
   * Unlike <code>BigInteger</code> does not copy down the sign
   * bit into the result.  The answer always has the same sign
   * as the argument unless the result becomes zero.
   *
   * @param n number to shift
   * @param k shift
   * @return integer right-shifted by <code>k</code>.
   */
  static Z shiftRight(final Z n, final int k) {
    if (n.getSize() == 0) {
      return n;
    }
    if (k <= 1) {
      if (k == 0) {
        return n;
      }
      if (k == 1) {
        return n.divide2();
      }
      return shiftLeft(n, -k);
    }
    int sn = Math.abs(n.getSize());
    final int big = k / Z.BASE_BITS;
    final int small = k - big * Z.BASE_BITS;
    if (big >= sn || (big == sn - 1 && (n.mValue[big] >>> small) == 0)) {
      return Z.ZERO;
    }
    sn -= big;
    final int[] d = new int[sn];
    if (small != 0) {
      final int c = Z.BASE_BITS - small;
      --sn;
      for (int i = 0; i < sn; ++i) {
        d[i] = (n.mValue[i + big] >>> small) + ((n.mValue[i + big + 1] << c) & Z.BASE_MASK);
      }
      if ((d[sn] = n.mValue[sn + big] >>> small) != 0) {
        ++sn;
      }
    } else {
      // exact multiple of BASE_BITS
      System.arraycopy(n.mValue, big, d, 0, sn);
    }
    return new Z(d, n.getSize() < 0 ? -sn : sn);
  }

}
