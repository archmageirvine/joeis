package irvine.math.z;

/**
 * Subtraction.
 * @author Sean A. Irvine
 */
final class Sub {

  private Sub() { }

  /*
   * Perform a-b where a and b have the same sign and abs(a) >= abs(b). The
   * result is placed in c and the size of the result returned. The array
   * c is assumed to have sufficient space for the result.
   */
  static int sub(final int[] a, final int sa, final int[] b, final int sb, final int[] c) {
    assert sa >= sb;
    int carry = 0;
    int k = 0;
    // Handle common parts
    while (k < sb) {
      final int t = a[k] - b[k] + carry;
      c[k++] = t & Z.BASE_MASK;
      carry = t >> Z.BASE_BITS;
    }
    // Handle any extra part from a
    while (k < sa) {
      final int t = a[k] + carry;
      c[k++] = t & Z.BASE_MASK;
      carry = t >> Z.BASE_BITS;
    }
    // Truncate any leading 0s
    while (--k >= 0 && c[k] == 0) {
      // DO NOTHING
    }
    return k + 1;
  }

  /**
   * Compute <code>a-b</code> where a and b are positive and <code>a</code> is at least <code>b</code>.
   * @param a minuend
   * @param b subtrahend
   * @return <code>a-b</code>
   */
  static Z sub(final Z a, final Z b) {
    final int sa = a.getSize();
    final int sb = b.getSize();
    assert sa >= sb;
    final int[] c = new int[sa]; // Result cannot be larger than a
    final int sc = sub(a.mValue, sa, b.mValue, sb, c);
    return new Z(c, sc);
  }

  /**
   * Return an integer which is this integer minus the integer <code>n</code>.
   * @param a minuend
   * @param b subtrahend
   * @return <code>a-b</code>
   */
  static Z subtract(final Z a, final Z b) {
    if (b.getSize() == 0) {
      return a; // i.e., b == 0
    }
    if (a.getSize() == 0) {
      return b.negate(); // i.e., a == 0
    }
    int sa = a.getSize();
    int sb = b.getSize();
    final boolean signa = sa < 0;
    if (signa == sb < 0) {
      // Signs are the same, a - b or (-a) - (-b)
      final int cmp = Compare.compare(a, b);
      if (cmp == 0) {
        return Z.ZERO;
      }
      final int saa = Math.abs(sa);
      final int sba = Math.abs(sb);
      if (signa == cmp > 0) {
        // (a < 0, a > b) or (a > 0, a < b)
        // (-b) - (-a) or b - a with |b| > |a|
        final int[] c = new int[sba];
        final int sc = sub(b.mValue, sba, a.mValue, saa, c);
        return new Z(c, signa ? sc : -sc);
      } else {
        // (a > 0, a > b) or (a < 0, a < b)
        // a - b or (-a) - (-b) with |a| > |b|
        final int[] c = new int[saa];
        final int sc = sub(a.mValue, saa, b.mValue, sba, c);
        return new Z(c, signa ? -sc : sc);
      }
    } else {
      // Signs are different, a - (-b) or (-a) - b
      // Convert to an addition
      // Note negation is comparatively cheap
      return signa ? a.negate().add(b).negate() : Add.add(a, b.negate());
    }
  }
}
