package irvine.math.z;

/**
 * Squaring.
 *
 * @author Sean A. Irvine
 */
final class Sqr {

  private Sqr() { }

  /** Number of digits to use Karatsuba squaring for. */
  private static final int KAR_SQR = 30;

  /* Karatsuba squaring. */
  static Z karSqr(final Z a, final int shi) {
    final int alen = a.mSign < 0 ? -a.mSign : a.mSign;
    if (shi >= Mul.KAR_DEPTH || alen < KAR_SQR) {
      final int[] c = new int[alen << 1];
      int carry = 0;
      int i = -1;
      for (int j = 0; j < alen; ++j) {
        i += 2;
        final int qs = a.mValue[j];
        int qa = i;
        int qc = 0;
        for (int qi = alen - j, qb = j; qi > 1; --qi) {
          final int pat = c[qa] + qc;
          final int aqv = a.mValue[++qb];
          final int paa = (pat + aqv * qs) & Z.BASE_MASK;
          qc = (int) (0.25 + Z.BASE_INV * ((double) (pat - paa) + (double) aqv * (double) qs));
          c[qa++] = paa;
        }
        c[qa] += qc;

        int u = (c[i - 1] << 1) + carry;
        c[i - 1] = u & Z.BASE_MASK;
        u >>>= Z.BASE_BITS;
        u += c[i] << 1;
        final int p = a.mValue[j];
        final int at = c[i - 1];
        final int aa = (at + p * p) & Z.BASE_MASK;
        final double dp = (double) p;
        carry = (int) (0.25 + Z.BASE_INV * ((double) (at - aa) + dp * dp));
        c[i - 1] = aa;
        u += carry;
        carry = u >>> Z.BASE_BITS;
        c[i] = u & Z.BASE_MASK;
      }

      while (i >= 0 && c[i] == 0) {
        --i; // DO NOTHING
      }
      return new Z(c, i + 1);
    }

    final int hlen = (alen + 1) >>> 1;
    // now truncate a to its bottom half, taking care with the special
    // case where leading digits of the bottom half are zero
    int z = hlen;
    while (--z >= 0 && a.mValue[z] == 0) {
      // DO NOTHING
    }
    a.mSign = z + 1;

    // final Z aTopHalf = a.shiftRight(hlen * BASE_BITS);
    final int[] aTop = new int[alen - hlen];
    System.arraycopy(a.mValue, hlen, aTop, 0, aTop.length);
    final Z aTopHalf = new Z(aTop, aTop.length);
    final Z a1 = karSqr(a, shi + 1);
    final Z a2 = karSqr(a.add(aTopHalf), shi + 1);
    a.mSign = alen;
    final Z c = karSqr(aTopHalf, shi + 1);
    final Z a0 = Sub.sub(Sub.sub(a2, a1), c).shiftLeft((long) hlen * Z.BASE_BITS);
    final Z cc = c.shiftLeft((long) ((long) hlen << 1) * Z.BASE_BITS);
    System.arraycopy(a1.mValue, 0, cc.mValue, 0, a1.mSign);
    return cc.add(a0);
  }

  /**
   * Return the square of an integer.
   *
   * @param n number to square
   * @return <code>n^2</code>
   */
  static Z square(final Z n) {
    if (n.getSize() == 0) {
      return Z.ZERO;
    }
    final int sign = n.getSize();
    if (sign < 0) {
      n.mSign = -sign;
    }
    final Z r = karSqr(n, 0);
    n.mSign = sign; // restore sign
    return r;
  }

}
