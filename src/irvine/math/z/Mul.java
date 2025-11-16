package irvine.math.z;

import java.util.Arrays;

/**
 * Multiplication.
 * @author Sean A. Irvine
 */
final class Mul {

  private Mul() { }

  /** Number of digits to use Karatsuba multiplication for. */
  private static final int KAR_MUL = 20;
  /** Depth of Karatsuba multiplication. */
  static final int KAR_DEPTH = 20;

  /*
   * Perform a * b placing the result in c (assumed to have enough space).
   */
  private static void mul(final int[] a, final int sa, final int[] b, final int sb, final int[] c) {
    for (int i = 0; i < sa; ++i) {
      final long s = a[i];
      int k = i;
      long carry = 0;
      for (int j = 0; j < sb; ++j, ++k) {
        final long t = b[j] * s + c[k] + carry;
        c[k] = (int) (t & Z.BASE_MASK);
        carry = t >>> Z.BASE_BITS;
      }
      c[k] += carry;
    }
  }

  /* Karatsuba multiplication. */
  static Z karMul(final Z a, final Z b, final int shi) {
    final int sa = a.getSize();
    final int sb = b.getSize();
    assert sa >= 0;
    assert sb >= 0;
    if (shi >= KAR_DEPTH || sa < KAR_MUL || sb < KAR_MUL) {
      // Base case, ordinary multiplication
      int sc = sa + sb; // Maximum possible length of the product
      final int[] c = new int[sc];
      mul(a.mValue, sa, b.mValue, sb, c);
      while (sc > 0 && c[sc - 1] == 0) {
        --sc;
      }
      assert sc == 0 || c[sc - 1] != 0;
      return new Z(c, sc);
    }

    // Karatsuba
    final int hlen = (sa + 1) >>> 1; // Half the size of a

    // Construct the top half, equivalent to a >>> hlen * BASE_BITS
    final int[] ahi = Arrays.copyOfRange(a.mValue, hlen, sa);
    final Z aHi = new Z(ahi, ahi.length);
    // Truncate "a" to its bottom half, taking care with the special
    // case where leading digits of the bottom half are zero
    int saLo = hlen;
    while (saLo > 0 && a.mValue[saLo - 1] == 0) {
      --saLo;
    }
    final Z aLo = new Z(a.mValue, saLo);

    if (hlen < b.getSize()) {
      // Truncate b to its bottom half
      int sbLo = hlen;
      while (sbLo > 0 && b.mValue[sbLo - 1] == 0) {
        --sbLo;
      }
      final Z bLo = new Z(b.mValue, sbLo);
      final Z abLo = karMul(aLo, bLo, shi + 1);
      final Z aAdd = Add.add(aLo, aHi);
      final int[] bhi = Arrays.copyOfRange(b.mValue, hlen, sb);
      final Z bTopHalf = new Z(bhi, bhi.length);
      final Z c = karMul(aHi, bTopHalf, shi + 1);
      final Z r = Sub.sub(Sub.sub(karMul(aAdd, Add.add(bLo, bTopHalf), shi + 1), abLo), c);
      final Z rs = r.shiftLeft((long) hlen * Z.BASE_BITS);
      final Z cs = c.shiftLeft((long) hlen * 2 * Z.BASE_BITS);
      System.arraycopy(abLo.mValue, 0, cs.mValue, 0, abLo.getSize());
      return Add.add(cs, rs);
    } else {
      final Z abLo = karMul(aLo, b, shi + 1);
      final Z aAdd = Add.add(aLo, aHi);
      final Z r = Sub.sub(karMul(aAdd, b, shi + 1), abLo).shiftLeft((long) hlen * Z.BASE_BITS);
      return Add.add(abLo, r);
    }
  }

  /**
   * Compute the product of this integer with another integer.
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
   * base this is more efficient than first converting the long into Z.
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

    // Arrange for both arguments to be positive, but keep track of the
    // sign necessary for the final result
    int sa = a.getSize();
    final boolean resultNegative;
    if (sa < 0) {
      sa = -sa;
      if (b < 0L) {
        b = -b;
        resultNegative = false;
      } else {
        resultNegative = true;
      }
    } else {
      resultNegative = b < 0L;
      if (resultNegative) {
        b = -b;
      }
    }

    final int[] aa = a.mValue;
    final int[] c = new int[sa + 1]; // Can be at most one limb longer
    long carry = 0;
    int k;
    for (k = 0; k < sa; ++k) {
      final long t = aa[k] * b + carry;
      c[k] = (int) (t & Z.BASE_MASK);
      carry = t >>> Z.BASE_BITS;
    }
    c[k] = (int) carry;
    final int productSize = c[sa] != 0 ? sa + 1 : sa;
    return new Z(c, resultNegative ? -productSize : productSize);
  }

}
