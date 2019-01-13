package irvine.math.z;

/**
 * Addition.
 *
 * @author Sean A. Irvine
 */
final class Add {

  private Add() { }

  /*
   * Perform a+b where a and b have same sign and abs(a)&gt;=abs(b). The
   * result is placed in c and the size of the result returned. The array
   * <code>c</code> is assumed to have sufficient space for the result.
   */
  private static int add(final int[] a, final int sa, final int[] b, final int sb, final int[] c) {
    int carry = 0;
    int i = 0;
    // Add common parts
    while (i < sb) {
      int t = a[i] + b[i] + carry;
      if (t < Z.BASE) {
        carry = 0;
      } else {
        t -= Z.BASE;
        carry = 1;
      }
      c[i++] = t;
    }
    // Handle extra part of a
    while (i < sa) {
      int t = a[i] + carry;
      if (t < Z.BASE) {
        carry = 0;
      } else {
        t -= Z.BASE;
        carry = 1;
      }
      c[i++] = t;
    }
    // Handle any remaining carry
    if (carry != 0) {
      c[i++] = 1;
    }
    return i;
  }

  /**
   * Return the sum of this integer and <code>n</code>.
   *
   * @param a addend
   * @param b addend
   * @return <code>a+b</code>
   */
  static Z add(final Z a, final Z b) {
    int sa = a.getSize();
    if (sa == 0) {
      return b;
    }
    int sb = b.getSize();
    if (sb == 0) {
      return a;
    }
    final boolean signa = sa < 0;
    final int[] c;
    if (signa == (sb < 0)) {
      // Addends have same sign
      if (signa) {
        sa = -sa;
        sb = -sb;
      }
      // Allocate space for the result, +1 allows for carry, but will not be
      // used in most cases.
      c = new int[Math.max(sa, sb) + 1];
      if (sa == sb) {
        // Same size
        int carry = 0;
        for (int i = 0; i < sa; ++i) {
          int t = a.mValue[i] + b.mValue[i] + carry;
          if (t < Z.BASE) {
            carry = 0;
          } else {
            t -= Z.BASE;
            carry = 1;
          }
          c[i] = t;
        }
        if (carry != 0) {
          c[sa++] = 1;
        }
      } else if (sa > sb) {
        sa = add(a.mValue, sa, b.mValue, sb, c);
      } else {
        sa = add(b.mValue, sb, a.mValue, sa, c);
      }
      return new Z(c, signa ? -sa : sa);
    } else {
      // Signs are different
      final Z aa, bb;
      if (signa) {
        aa = a.negate();
        bb = b;
      } else {
        aa = a;
        bb = b.negate();
      }
      final int t = Compare.compare(aa, bb);
      if (t == 0) {
        return Z.ZERO;
      } else if (t > 0) {
        final Z zd = Sub.sub(aa, bb);
        if (signa) {
          zd.mSign = -zd.getSize();
        }
        return zd;
      } else {
        final Z zd = Sub.sub(bb, aa);
        if (!signa) {
          zd.mSign = -zd.getSize();
        }
        return zd;
      }
    }
  }

}
