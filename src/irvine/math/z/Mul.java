package irvine.math.z;

import java.util.Arrays;

/**
 * Multiplication.
 *
 * @author Sean A. Irvine
 */
final class Mul {

  private Mul() { }

  /** Number of digits to use Karatsuba multiplication for. */
  private static final int KAR_MUL = 30;
  /** Depth of Karatsuba multiplication. */
  static final int KAR_DEPTH = 20;

  /* Karatsuba multiplication. */
  static Z karMul(final Z a, final Z b, final int shi) {
    final int alen = a.getSize();
    final int blen = b.getSize();
    assert alen >= 0;
    assert blen >= 0;
    if (shi >= KAR_DEPTH || alen < KAR_MUL || blen < KAR_MUL) {
      int clen = alen + blen; // inside first loop?
      final int[] cc = new int[clen];
      if (alen <= blen) {
        for (int i = 0; i < alen; ++i) {
          final int s = a.mValue[i];
          int k = i;
          int carry = 0;
          for (int j = 0; j < blen; ++j, ++k) {
            final int bb = b.mValue[j];
            final int tt = cc[k] + carry;
            final int aa = (tt + bb * s) & Z.BASE_MASK;
            carry = (int) (0.25 + Z.BASE_INV * (((double) (tt - aa)) + (double) bb * (double) s));
            cc[k] = aa;
          }
          cc[k] += carry;
        }
      } else {
        for (int i = 0; i < blen; ++i) {
          final int s = b.mValue[i];
          int k = i;
          int carry = 0;
          for (int j = 0; j < alen; ++j, ++k) {
            final int bb = a.mValue[j];
            final int tt = cc[k] + carry;
            final int aa = (tt + bb * s) & Z.BASE_MASK;
            carry = (int) (0.25 + Z.BASE_INV * (((double) (tt - aa)) + (double) bb * (double) s));
            cc[k] = aa;
          }
          cc[k] += carry;
        }
      }
      while (clen-- > 0 && cc[clen] == 0) {
        // DO NOTHING
      }
      return new Z(cc, clen + 1);
    }

    // Karatsuba
    final int hlen = (alen + 1) >>> 1;

    // construct the top half of a, equivalent to a >>> hlen * BASE_BITS
    // final Z aTopHalf = a.shiftRight(hlen * BASE_BITS);
    final int[] aTop = new int[alen - hlen];
    System.arraycopy(a.mValue, hlen, aTop, 0, aTop.length);
    final Z aTopHalf = new Z(aTop, aTop.length);

    // now truncate a to its bottom half, taking care with the special
    // case where leading digits of the bottom half are zero
    int z = hlen;
    while (--z >= 0 && a.mValue[z] == 0) {
      // DO NOTHING
    }
    a.mSign = z + 1;

    final boolean bigb = hlen < b.getSize();
    if (bigb) {
      // truncate b to its bottom half
      z = hlen;
      while (--z >= 0 && b.mValue[z] == 0) {
        // DO NOTHING
      }
      b.mSign = z + 1;
    }

    final Z abBottom = karMul(a, b, shi + 1);
    final Z aAdd = Add.add(a, aTopHalf);
    a.mSign = alen; // restore a to full value

    Z r;
    Z c = null;
    if (bigb) {
      // final Z bTopHalf = b.shiftRight(hlen * BASE_BITS);
      final int[] bTop = new int[blen - hlen];
      System.arraycopy(b.mValue, hlen, bTop, 0, bTop.length);
      final Z bTopHalf = new Z(bTop, bTop.length);
      c = karMul(aTopHalf, bTopHalf, shi + 1);
      r = karMul(aAdd, Add.add(b, bTopHalf), shi + 1);
      b.mSign = blen; // restore b to full value
    } else {
      r = karMul(aAdd, b, shi + 1);
    }

    r = Sub.sub(r, abBottom);
    if (bigb) {
      r = Sub.sub(r, c);
    }
    r = r.shiftLeft((long) hlen * Z.BASE_BITS);
    if (bigb) {
      c = c.shiftLeft((long) ((long) hlen << 1) * Z.BASE_BITS);
      // c = c + abBottom (can do with copy since no overlap)
      System.arraycopy(abBottom.mValue, 0, c.mValue, 0, abBottom.getSize());
    } else {
      c = abBottom;
    }
    return Add.add(c, r);
  }

  /**
   * Compute the product of this integer with another integer.
   *
   * @param a multiplicand
   * @param b multiplicand
   * @return the product <code>a*b</code>
   */
  static Z multiply(final Z a, final Z b) {
    if (a.getSize() == 0 || b.getSize() == 0) {
      return Z.ZERO;
    }
    if (a == b) {
      return a.square();
    }
    final boolean na = a.getSize() < 0;
    if (na) {
      a.mSign = -a.getSize();
    }
    final boolean nb = b.getSize() < 0;
    if (nb) {
      b.mSign = -b.getSize();
    }
    final Z c = a.getSize() > b.getSize() ? karMul(a, b, 0) : karMul(b, a, 0);
    if (na != nb) {
      c.mSign = -c.getSize();
    }
    if (na) {
      a.mSign = -a.getSize();
    }
    if (nb) {
      b.mSign = -b.getSize();
    }
    return c;
  }

  /**
   * Multiply an integer by a long.  Provided the long is smaller than the
   * base this is more efficient than first converting the long into an
   * integer.
   *
   * @param a multiplicand
   * @param b multiplicand
   * @return <code>a * b</code>
   */
  static Z multiply(final Z a, long b) {
    if (b >= Z.BASE || b <= -Z.BASE) {
      return Mul.multiply(a, Z.valueOf(b));
    } else if (a.getSize() == 0 || b == 0L) {
      return Z.ZERO;
    }
    final boolean negative;
    final int size;
    if (a.getSize() < 0) {
      size = -a.getSize();
      if (b < 0L) {
        b = -b;
        negative = false;
      } else {
        negative = true;
      }
    } else {
      size = a.getSize();
      negative = b < 0L;
      if (negative) {
        b = -b;
      }
    }

    final int[] av = Arrays.copyOf(a.mValue, size + 1);
    final int s = (int) b - 1; // safe since b < BASE
    int carry = 0;
    int i;
    for (i = 0; i < size; ++i) {
      final int bb = av[i];
      final int tt = bb + carry;
      final int aa = (tt + bb * s) & Z.BASE_MASK;
      carry = (int) (0.25 + Z.BASE_INV * ((double) (tt - aa) + (double) bb * (double) s));
      av[i] = aa;
    }
    av[i] += carry;

    final int productSize = av[size] != 0 ? size + 1 : size;
    return new Z(av, negative ? -productSize : productSize);
  }

}
