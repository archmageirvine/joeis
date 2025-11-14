package irvine.math.z;

/**
 * Addition.
 * @author Sean A. Irvine
 */
final class Add {

  private Add() { }

  /*
   * Perform a+b where a and b have the same sign and abs(a) >= abs(b). The
   * result is placed in c and the size of the result returned. The array
   * c is assumed to have sufficient space for the result.
   */
  private static int add(final int[] a, final int sa, final int[] b, final int sb, final int[] c) {
    assert sa >= sb;
    int carry = 0;
    int k = 0;
    // Add common parts
    while (k < sb) {
      final int t = a[k] + b[k] + carry;
      carry = t >>> Z.BASE_BITS;
      c[k++] = t & Z.BASE_MASK;
    }
    // Handle any extra part of a
    while (k < sa) {
      final int t = a[k] + carry;
      carry = t >>> Z.BASE_BITS;
      c[k++] = t & Z.BASE_MASK;
    }
    // Handle any remaining carry
    if (carry != 0) {
      c[k++] = 1;
    }
    return k;
  }

  /**
   * Return the sum of this integer and <code>n</code>.
   * @param a addend
   * @param b addend
   * @return <code>a+b</code>
   */
  static Z add(final Z a, final Z b) {
    int sa = a.getSize();
    if (sa == 0) {
      return b; // i.e., a==0
    }
    int sb = b.getSize();
    if (sb == 0) {
      return a; // i.e., b==0
    }
    final boolean signa = sa < 0;
    if (signa == (sb < 0)) {
      // Addends have same sign
      if (signa) {
        sa = -sa;
        sb = -sb;
      }
      assert sa > 0 && sb > 0;
      // Allocate space for the result, +1 allows for carry
      final int[] c = new int[Math.max(sa, sb) + 1];
      final int sc = sa >= sb
        ? add(a.mValue, sa, b.mValue, sb, c)
        : add(b.mValue, sb, a.mValue, sa, c);
      return new Z(c, signa ? -sc : sc);
    } else {
      // Signs are different; i.e., this is actually a subtraction
      final int t = Compare.compareAbs(a, b);
      if (t == 0) {
        return Z.ZERO;
      } else if (t > 0) {
        // |a| > |b|, perform a-b
        final int saa = Math.abs(sa);
        final int[] c = new int[saa];
        final int sc = Sub.sub(a.mValue, saa, b.mValue, Math.abs(sb), c);
        return new Z(c, signa ? -sc : sc);
      } else {
        // |b| > |a|, perform b-a
        final int sba = Math.abs(sb);
        final int[] c = new int[sba];
        final int sc = Sub.sub(b.mValue, sba, a.mValue, Math.abs(sa), c);
        return new Z(c, signa ? sc : -sc);
      }
    }
  }
}
