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
      if ((c[k] = a[k] - b[k] - carry) >= 0) {
        carry = 0;
      } else {
        c[k] += Z.BASE;
        carry = 1;
      }
      ++k;
    }
    // Handle any extra part from a
    while (k < sa) {
      if ((c[k] = a[k] - carry) >= 0) {
        carry = 0;
      } else {
        c[k] += Z.BASE;
        carry = 1;
      }
      ++k;
    }
    // Truncate
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
      return a;
    }
    if (a.getSize() == 0) {
      return b.negate();
    }

    int sa = a.getSize();
    int sb = b.getSize();
    final boolean na = sa < 0;
    if (na == sb < 0) {
      // signs are the same
      final int cf = Compare.compare(a, b);
      if (cf == 0) {
        return Z.ZERO;
      }
      final Z aa, bb;
      if ((cf > 0 && na) || (cf < 0 && !na)) {
        // swap argument order
        aa = b;
        bb = a;
        sa = sb;
        sb = a.getSize();
      } else {
        aa = a;
        bb = b;
      }
      if (na) {
        sa = -sa;
        sb = -sb;
      }
      final int[] c = new int[sa];
      int carry = 0;
      int i = 0;
      for (; i < sb; ++i) {
        if ((c[i] = aa.mValue[i] - bb.mValue[i] - carry) >= 0) {
          carry = 0;
        } else {
          c[i] += Z.BASE;
          carry = 1;
        }
      }
      for (; i < sa; ++i) {
        if ((c[i] = aa.mValue[i] - carry) >= 0) {
          carry = 0;
        } else {
          c[i] += Z.BASE;
          carry = 1;
        }
      }
      while (--sa > 0 && c[sa] == 0) {
        // DO NOTHING
      }
      ++sa;
      return new Z(c, cf > 0 ? sa : -sa);
    } else {
      // signs are different, convert to an addition problem
      return na ? a.negate().add(b).negate() : Add.add(a, b.negate());
    }
  }
}
