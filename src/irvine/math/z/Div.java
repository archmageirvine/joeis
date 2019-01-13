package irvine.math.z;

/**
 * Division.
 *
 * @author Sean A. Irvine
 */
final class Div {

  private Div() { }

  /* Special values used in floating-point short cuts. */
  static final double FUDGE;
  /** 3 times the smallest power-of-2 double that can modify the value 1.0. */
  static final double EPSILON;

  static {
    // this result can vary depending on exact nature of floating-point
    // on the platform
    final double localOne = 1.0;
    final double localHalf = 1.0 / 2.0;
    double epsilon = localOne;
    while (localOne != localOne + epsilon) {
      epsilon *= localHalf;
    }
    epsilon += epsilon;
    EPSILON = epsilon * 3.0;
    FUDGE = Z.DBASE + EPSILON * Z.DBASE;
  }

  /**
   * Compute the quotient and remainder of this integer divided by <code>n</code>.
   * The first element of the returned array is the quotient and the second
   * element is the remainder.
   *
   * @param a dividend
   * @param b divisor
   * @return quotient and remainder
   * @exception ArithmeticException if <code>n</code> is 0.
   */
  static Z[] divideAndRemainder(final Z a, final Z b) {
    final int sb = Math.abs(b.getSize());
    // Handle a/0
    if (sb == 0) {
      throw new ArithmeticException("Division by zero.");
    }
    final int sa = Math.abs(a.getSize());
    // Handle 0/b
    if (sa == 0) {
      return new Z[] {a, a};
    }
    // Handle (most cases of) b > a
    if (sb > sa) {
      return new Z[] {Z.ZERO, a};
    }
    if (b.equals(a)) {
      return new Z[] {Z.ONE, Z.ZERO};
    }
    // Handle small divisors
    final int top = b.mValue[sb - 1];
    if (sb == 1) {
      final Z q = divide(a, b.getSize() < 0 ? -top : top);
      return new Z[] {q, Z.valueOf(a.mAuxiliary)};
    }

    final double t = Z.DBASE * (top * Z.DBASE + b.mValue[sb - 2]);
    final double topinv = FUDGE / (sb != 2 ? t + b.mValue[sb - 3] : t);

    final int[] c = new int[sa + 1];
    System.arraycopy(a.mValue, 0, c, 0, sa);
    int sq = sa - sb; // size of quotient
    assert sq >= 0;
    final int[] d = new int[sa];

    for (int i = sa; i >= sb; --i) {
      // This computation with doubles is faster than using longs
      // the original had the +1.0 but I never found a case that needed it
      //      double aux = DBASE * (c[i] * DBASE + c[i - 1]) + 1.0;
      double aux = Z.DBASE * (c[i] * Z.DBASE + c[i - 1]);
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
        for (int j = 0, jj = i - sb; jj < i;) {
          final int nv = b.mValue[j++];
          final int tt = c[jj] + cc;
          c[jj] = (tt + nv * dr) & Z.BASE_MASK;
          cc = (int) (0.25 + Z.BASE_INV * ((tt - c[jj++]) + nv * ddr)) + Z.BASE_MASK - nv;
        }
        c[i] += cc - Z.BASE;
        int z = i;
        while (c[z] < 0) {
          --qq;
          int s = 0;
          for (int j = 0, ii = i - sb; j < sb; ++j) {
            s += c[ii] + b.mValue[j];
            c[ii++] = s & Z.BASE_MASK;
            s >>= Z.BASE_BITS;
          }
          c[z--] += s;
        }
      }
      d[i - sb] = qq;
    }

    int pn = sb;
    while (--pn >= 0 && c[pn] == 0) {
      // DO NOTHING
    }
    ++pn;
    sq += 2;
    while (--sq >= 0 && d[sq] == 0) {
      // DO NOTHING
    }
    ++sq;
    return new Z[] {new Z(d, (a.getSize() ^ b.getSize()) >= 0 ? sq : -sq), new Z(c, a.getSize() >= 0 ? pn : -pn)};
  }

  /**
   * Divide an integer by the specified long and return the
   * quotient. After this call, use <code>a.auxiliary()</code>
   * to retrieve the corresponding remainder.
   *
   * @param a dividend
   * @param d divisor
   * @return quotient
   */
  static Z divide(final Z a, final long d) {
    if (d == 0L) {
      throw new ArithmeticException("Division by zero.");
    }
    int sa = Math.abs(a.getSize());
    if (sa < 3) {
      // Use long divide if we can fit in a long, also handles 0/d case
      final long ss = a.longValue();
      a.mAuxiliary = ss % d;
      return Z.valueOf(ss / d);
    }
    final long da = Math.abs(d);
    if (da >= Z.BASE) {
      // If division is too large, flip to Z divider
      final Z[] z = divideAndRemainder(a, Z.valueOf(d));
      a.mAuxiliary = z[1].longValue();
      return z[0];
    }
    final int[] b = new int[sa];
    final int dd = (int) da;
    final int sign = (a.getSize() < 0 ? 2 : 0) | (d < 0 ? 1 : 0);
    final double dinv = 1.0 / (double) dd;
    assert sa > 2;
    int c = a.mValue[--sa] < dd ? a.mValue[sa--] : 0;
    for (int i = sa; i >= 0; --i) {
      int lq21 = (int) ((Z.DBASE * (double) c + (double) a.mValue[i]) * dinv);
      final int t = (lq21 * dd) & Z.BASE_MASK;
      c -= (int) (0.25 + Z.BASE_INV * ((((double) lq21) * ((double) dd)) - (double) t));
      c <<= Z.BASE_BITS;
      c += a.mValue[i];
      c -= t;

      if (c < 0) {
        do {
          --lq21;
        } while ((c += dd) < 0);
      } else {
        while (c >= dd) {
          c -= dd;
          ++lq21;
        }
      }
      b[i] = lq21;
    }
    /*
    while (sa >= 0 && b[sa] == 0) {
      System.err.println("Hi: " + this.bigIntegerValue().toString() + " " + d);
      --sa;
    }
    */
    ++sa;
    a.mAuxiliary = sign < 2 ? c : -c;
    // sign == 0 || sign == 3 is equiv to (sign + 1) & 2
    return new Z(b, ((sign + 1) & 2) == 0 ? sa : -sa);
  }

}
