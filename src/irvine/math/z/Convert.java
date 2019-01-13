package irvine.math.z;

import irvine.math.IntegerUtils;

import java.math.BigInteger;

/**
 * Conversion functions.
 *
 * @author Sean A. Irvine
 */
public final class Convert {

  private Convert() { }

  /**
   * Convert a string in given radix to an integer.
   *
   * @param val value to convert
   * @param radix base of string
   * @return integer representation
   */
  public static Z valueOf(final String val, final int radix) {
    if (radix < 2 || radix > 36) {
      throw new IllegalArgumentException("Radix must be in [2,36].");
    }
    final int len = val.length();
    if (len == 0) {
      throw new IllegalArgumentException("Empty string not allowed.");
    }
    final boolean negative = val.charAt(0) == '-';
    int cnt = 0;
    if (negative) {
      if (len == 1) {
        throw new IllegalArgumentException("Minus without digits.");
      }
      cnt = 1;
    }
    Z a = Z.ZERO;
    final int limit = (int) (Math.log(Long.MAX_VALUE) / Math.log(radix)) - 1;
    while (cnt < len) {
      long m = 0;
      long q = 1;
      // Accumulate the product in a long where possible
      for (int j = 0; j < limit && cnt < len; ++j) {
        final char c = val.charAt(cnt++);
        final int v = IntegerUtils.charToValue(c);
        if (v < 0 || v >= radix) {
          throw new IllegalArgumentException("Bad character in number: " + c);
        }
        m *= radix;
        m += v;
        q *= radix;
      }
      a = a.multiply(q);
      a = a.add(m);
    }
    return negative ? a.negate() : a;
  }

  /**
   * Return an integer with the same value as the specified long.
   *
   * @param n a long value
   * @return an integer with the value <code>n</code>
   */
  static Z valueOf(final long n) {
    if (n == 0L) {
      return Z.ZERO;
    }
    final int[] a = new int[1 + 64 / Z.BASE_BITS];
    if (n == Long.MIN_VALUE) {
      // Very tricky case of a value that cannot be made positive
      a[a.length - 1] = 1 << (63 % Z.BASE_BITS);
      return new Z(a, -a.length);
    }
    long val = Math.abs(n);
    int i = 0;
    while (val > 0L) {
      a[i++] = (int) val & Z.BASE_MASK;
      val >>>= Z.BASE_BITS;
    }
    return new Z(a, n < 0 ? -i : i);
  }

  /**
   * Convert this number into a Java BigInteger of the same value.
   *
   * @param n number
   * @return BigInteger version of this number
   */
  static BigInteger bigIntegerValue(final Z n) {
    if (n.getSize() == 0) {
      return BigInteger.ZERO;
    }
    final int sign, sn;
    if (n.getSize() < 0) {
      sign = -1;
      sn = -n.getSize();
    } else {
      sign = 1;
      sn = n.getSize();
    }
    // Work out number of bytes required
    int bytes = 1 + (Bit.bitLength(n) >>> 3);
    final byte[] num = new byte[bytes];
    int offset = 1;
    long value = (long) n.mValue[0];
    int bitsLeft = Z.BASE_BITS;
    // Change endianness and base
    while (--bytes >= 0) {
      if (bitsLeft < 8 && offset < sn) {
        value |= (long) n.mValue[offset++] << bitsLeft;
        bitsLeft += Z.BASE_BITS;
      }
      num[bytes] = (byte) value;
      value >>>= 8;
      bitsLeft -= 8;
    }
    return new BigInteger(sign, num);
  }

  /**
   * Converts this integer to a long using a standard narrowing primitive.
   * If the number is too large only the low-order 64 bits are returned.
   *
   * @param n number to convert
   * @return long value
   */
  static long longValue(final Z n) {
    switch (n.getSize()) {
    case 0:
      return 0L;
    case 1:
      return (long) n.mValue[0];
    case -1:
      return (long) -n.mValue[0];
    case 2:
      return ((long) n.mValue[1] << Z.BASE_BITS) | n.mValue[0];
    case -2:
      return -(((long) n.mValue[1] << Z.BASE_BITS) | n.mValue[0]);
    default:
      return (((long) Logical.getDigit(n, 2) << Z.BASE_BITS | ((long) (Logical.getDigit(n, 1) & Z.BASE_MASK))) << Z.BASE_BITS) | (Logical.getDigit(n, 0) & Z.BASE_MASK);
    }
  }

  /**
   * Convert this number to a double.  If this number is too large
   * then the appropriate infinity is generated.
   *
   * @param n number to convert
   * @return double value
   */
  static double doubleValue(final Z n) {
    final boolean sign = n.getSize() < 0;
    double r = 0.0;
    for (int i = (sign ? -n.getSize() : n.getSize()) - 1; i >= 0; --i) {
      r *= Z.DBASE;
      r += (double) n.mValue[i];
    }
    return sign ? -r : r;
  }

  /**
   * Convert a Java <code>BigInteger</code> to this format.
   *
   * @param n integer to convert
   * @return Z version of this number
   */
  static Z valueOf(final BigInteger n) {
    if (n.equals(BigInteger.ZERO)) {
      return Z.ZERO;
    }
    final byte[] num;
    final boolean negative = n.compareTo(BigInteger.ZERO) < 0;
    if (negative) {
      num = n.negate().toByteArray();
    } else {
      num = n.toByteArray();
    }
    int offset = num.length;
    final int[] value = new int[1 + (offset << 3) / Z.BASE_BITS];
    int bitsLeft = 0;
    long v = 0L;
    // Change endianness and base
    for (int i = 0; i < value.length; ++i) {
      while (offset > 0 && bitsLeft < Z.BASE_BITS) {
        v |= (long) (num[--offset] & 0xFF) << bitsLeft;
        bitsLeft += 8;
      }
      value[i] = (int) v & Z.BASE_MASK;
      v >>>= Z.BASE_BITS;
      bitsLeft -= Z.BASE_BITS;
    }
    // Correct for any overshoot
    int size = value.length;
    while (value[size - 1] == 0) {
      --size;
    }
    return new Z(value, negative ? -size : size);
  }

}
