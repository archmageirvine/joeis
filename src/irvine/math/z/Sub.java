package irvine.math.z;

/**
 * Subtraction.
 *
 * @author Sean A. Irvine
 */
final class Sub {

  private Sub() { }

  /**
   * Compute <code>a-b</code> where a and b are positive and <code>a</code>
   * is at least <code>b</code>.
   *
   * @param a minuend
   * @param b subtrahend
   * @return <code>a-b</code>
   */
  static Z sub(final Z a, final Z b) {
    final int sa = a.getSize();
    final int sb = b.getSize();
    final int[] c = new int[sa];
    int carry = 0;
    int i = 0;
    for (; i < sb; ++i) {
      if ((c[i] = a.mValue[i] - b.mValue[i] - carry) >= 0) {
        carry = 0;
      } else {
        c[i] += Z.BASE;
        carry = 1;
      }
    }
    for (; i < sa; ++i) {
      if ((c[i] = a.mValue[i] - carry) >= 0) {
        carry = 0;
      } else {
        c[i] += Z.BASE;
        carry = 1;
      }
    }
    while (--i >= 0 && c[i] == 0) {
      // DO NOTHING
    }
    return new Z(c, i + 1);
  }

  /**
   * Return an integer which is this integer minus the integer <code>n</code>.
   *
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
