package irvine.math.z;

import irvine.math.function.Functions;

/**
 * Square root.
 *
 * @author Sean A. Irvine
 */
final class Sqrt {

  private Sqrt() { }

  /**
   * Return the square root of this integer.  The value of sqrt()[0]
   * is the floor of the square root and sqrt()[1] is the difference
   * such that <code>this=r[0]^2+r[1]</code> where <code>r</code> is
   * the result of calling this function.  In addition, the auxiliary
   * is set to 1 if this integer is a perfect square and 0 otherwise.
   * This is more efficient than calling <code>root(2)</code>.
   *
   * @param n number to take square root of
   * @return root and difference
   * @exception ArithmeticException for an attempt to take the square
   * root of a negative number.
   */
  static Z[] sqrt(final Z n) {
    if (n.getSize() == 0) {
      n.mAuxiliary = 1L;
      return new Z[] {Z.ZERO, Z.ZERO};
    }
    if (n.getSize() < 0) {
      throw new ArithmeticException("Sqrt of negative number.");
    }
    Z r, diff;
    if (n.getSize() == 1) {
      // fits easily in an int
      final int s = Functions.SQRT.i(n.mValue[0]);
      r = Z.valueOf(s);
      diff = Z.valueOf(s * s);
    } else {
      final int[] av = new int[n.getSize()];
      int sa = (n.getSize() + 1) >>> 1;
      final int aa = sa - 1;
      av[aa] = Functions.SQRT.i(n.mValue[n.getSize() - 1]) + 1;
      if ((n.getSize() & 1) == 0) {
        av[aa] <<= Z.BASE_BITS_SH;
      }
      if ((av[aa] & Z.BASE) != 0) {
        av[aa] = 0;
        av[sa++] = 1;
      }
      Z a = new Z(av, sa);
      while (true) {
        final Z ndiva = n.divide(a);
        r = Shift.shiftRight(a.add(ndiva), 1);
        if (r.compareTo(ndiva) <= 0) {
          diff = Sqr.square(r);
          break;
        }
        diff = Sub.sub(r, ndiva);
        if (diff.mSign <= 1 && diff.mValue[0] <= 1) {
          diff = Sqr.square(r);
          if (diff.compareTo(n) > 0) {
            r = ndiva;
            diff = Sqr.square(r);
          }
          break;
        }
        a = r;
      }
    }
    final Z dif = Sub.sub(n, diff);
    n.mAuxiliary = dif.mSign == 0 ? 1 : 0;
    return new Z[] {r, dif};
  }

}
