package irvine.math.z;

/**
 * Modulo.
 *
 * @author Sean A. Irvine
 */
final class Mod {

  private Mod() { }

  /**
   * Compute this integer modulo another integer.  The sign of
   * result is the sign of the modulus unless the result is 0.
   *
   * @param a number
   * @param n modulus
   * @return <code>this%n</code>
   * @exception ArithmeticException if <code>n</code> is 0.
   */
  static Z mod(final Z a, final Z n) {
    if (n.getSize() == 0) { // i.e. n == 0
      throw new ArithmeticException();
    }
    if (a.getSize() == 0 || a.equals(n) || Z.ONE.equals(n)) {
      return Z.ZERO;
    }
    int sign = 0;
    final int ssa = a.getSize();
    final int sa;
    if (ssa < 0) {
      sa = -ssa;
      a.mSign = sa;
      sign = 2;
    } else {
      sa = ssa;
    }
    final int ssn = n.getSize();
    int sn;
    if (ssn < 0) {
      sn = -ssn;
      n.mSign = sn;
      ++sign;
    } else {
      sn = ssn;
    }
    final int top = n.mValue[sn - 1];
    Z r;
    if (sn == 1) {
      r = Z.valueOf(a.mod(top));
    } else if (sa < sn || a.compareTo(n) < 0) {
      r = a;
    } else {
      double topinv = Z.DBASE * (top * Z.DBASE + n.mValue[sn - 2]);
      if (sn != 2) {
        topinv += n.mValue[sn - 3];
      }
      topinv = Div.FUDGE / topinv;
      final int[] c = new int[sa + 1];
      System.arraycopy(a.mValue, 0, c, 0, sa);
      for (int i = sa; i >= sn; --i) {
        double aux = Z.DBASE * (c[i] * Z.DBASE + c[i - 1]); // + 1.0;
        if (i > 1) {
          aux += c[i - 2];
        }
        int qq = (int) (topinv * aux + 0.5);
        if (qq > 0) {
          if (qq >= Z.BASE) {
            qq = Z.BASE_MASK;
          }
          final int dr = Z.BASE - qq;
          final double ddr = (double) dr;
          int cc = Z.BASE;
          for (int j = 0, jj = i - sn; jj < i;) {
            final int nv = n.mValue[j++];
            final int tt = c[jj] + cc;
            c[jj] = (tt + nv * dr) & Z.BASE_MASK;
            cc = (int) (0.25 + Z.BASE_INV * ((double) (tt - c[jj++]) + nv * ddr)) + Z.BASE_MASK - nv;
          }
          c[i] += cc - Z.BASE;
          int z = i;
          while (c[z] < 0) {
            int s = 0;
            for (int j = 0, ii = i - sn; j < sn; ++j) {
              s += c[ii] + n.mValue[j];
              c[ii++] = s & Z.BASE_MASK;
              s >>>= Z.BASE_BITS;
            }
            c[z--] += s;
          }
        }
      }
      while (--sn >= 0 && c[sn] == 0) {
        // DO NOTHING
      }
      r = new Z(c, sn + 1);
    }
    if (r.getSize() != 0 && sign != 0) {
      if (sign <= 2) {
        r = sign == 1 ? Sub.subtract(r, n) : Sub.subtract(n, r);
      } else {
        r = r.negate();
      }
    }
    // restore signs to original values
    a.mSign = ssa;
    n.mSign = ssn;
    return r;
  }

}
