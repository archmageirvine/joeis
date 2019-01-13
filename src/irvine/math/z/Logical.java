package irvine.math.z;

/**
 * Logical operations.
 *
 * @author Sean A. Irvine
 */
final class Logical {

  private Logical() { }

  /**
   * Find the index of the first nonzero digit in the number. This
   * is useful for doing piecewise 2's complements.
   *
   * @param n number
   * @return position of first nonzero digit
   */
  private static int firstNonzeroDigitIndex(final Z n) {
    if (n.mFirstNonzeroDigitIndex == -1) {
      final int s = n.getSize() < 0 ? -n.getSize() : n.getSize();
      for (int i = 0; i < s; ++i) {
        if (n.mValue[i] != 0) {
          n.mFirstNonzeroDigitIndex = i;
          return i;
        }
      }
      // this happens only in the case of ZERO
      n.mFirstNonzeroDigitIndex = s;
    }
    return n.mFirstNonzeroDigitIndex;
  }

  /**
   * Get a digit in 2's complement format.
   *
   * @param n number to get digit from
   * @param digit digit number to get
   * @return two's complement value
   */
  static int getDigit(final Z n, final int digit) {
    assert digit >= 0 : "request for negative digit";
    // handle zero
    if (n.getSize() == 0) {
      return 0;
    }
    // handle positive
    if (n.getSize() > 0) {
      return digit < n.getSize() ? n.mValue[digit] : 0;
    }
    // handle negative
    // sign extend negative number
    if (digit >= -n.getSize()) {
      return -1; // & BASE_MASK;
    }
    return firstNonzeroDigitIndex(n) >= digit ? -n.mValue[digit] : ~n.mValue[digit];
  }

  /**
   * Perform some post-processing after a bitwise operation. This includes
   * performing two's complement for negative results, truncating the
   * result to the correct width, and clear spare bits in the representation.
   *
   * @param c 2's complement representation
   * @param csize valid digit count
   * @param complement should complementation be performed
   * @return integer representation
   */
  private static Z tidyResult(int[] c, int csize, final boolean complement) {
    if (complement) {
      // perform two's complement
      for (int i = 0; i < csize; ++i) {
        c[i] = ~c[i];
      }
      int i = -1;
      while (++i < csize && (++c[i] & Z.BASE_MASK) == 0) {
        // DO NOTHING
      }
      if (i == csize) {
        // result is longer than original inputs
        //        if (csize < c.length) {
        //          c[csize++] = 1;
        //        } else {
          // this rare situation arises when the array contains insufficient
          // space to hold the result, make a new array with all entries
          // except the most significant digit are zero
          c = new int[c.length + 1];
          c[csize] = 1;
          return new Z(c, -c.length);
          //        }
      }
    }

    // make sure the buffer bits are clear
    for (int i = 0; i < csize; ++i) {
      c[i] &= Z.BASE_MASK;
    }

    while (--csize >= 0 && c[csize] == 0) {
      // DO NOTHING
    }
    ++csize;
    return new Z(c, complement ? -csize : csize);
  }

  /**
   * Return the bitwise not of this integer. Returns a negative value
   * if and only if this number is non-negative. This computation is
   * arranged so that <code>n=~~n</code>.
   *
   * @param n number to complement
   * @return <code>~n</code>
   */
  static Z not(final Z n) {
    return n.negate().subtract(Z.ONE);
  }

  /**
   * Return the bitwise and of this integer with <code>n</code>.
   * The sign bits are also anded; thus the result is negative
   * if and only if both inputs are negative.
   *
   * @param a first number
   * @param n number to and
   * @return a &amp; n
   */
  static Z and(final Z a, final Z n) {
    if (a.equals(n)) {
      return a;
    }
    final int sa = Math.abs(a.getSize());
    final int sn = Math.abs(n.getSize());
    if (sa == 0 || sn == 0) {
      return Z.ZERO;
    }
    final int[] c = new int[sa > sn ? sa : sn];
    for (int i = 0; i < c.length; ++i) {
      c[i] = getDigit(a, i) & getDigit(n, i);
    }
    return tidyResult(c, c.length, (a.getSize() & n.getSize()) < 0);
  }

  /**
   * Return the bitwise and of this integer with <code>~n</code>.
   * The result is negative if and only if this number is negative
   * and <code>n</code> is positive.
   *
   * @param a first number
   * @param n number to <code>andNot</code> with
   * @return <code>a &amp; ~n</code>
   */
  static Z andNot(final Z a, final Z n) {
    if (a.equals(n)) {
      return Z.ZERO;
    }
    final int sa = a.getSize() < 0 ? -a.getSize() : a.getSize();
    final int sn = n.getSize() < 0 ? -n.getSize() : n.getSize();
    if (sn == 0) {
      return a;
    }
    if (sa == 0) {
      return Z.ZERO;
    }
    final int[] c = new int[sa > sn ? sa : sn];
    for (int i = 0; i < c.length; ++i) {
      c[i] = getDigit(a, i) & ~getDigit(n, i);
    }
    return tidyResult(c, c.length, (a.getSize() & ~n.getSize()) < 0);
  }

  /**
   * Return the bitwise or of this integer with <code>n</code>.
   * The sign bits are also ored; thus the result is negative
   * if either input is negative
   *
   * @param a first number
   * @param n number to or
   * @return this or n
   */
  static Z or(final Z a, final Z n) {
    if (a.equals(n)) {
      return a;
    }
    final int sa = a.getSize() < 0 ? -a.getSize() : a.getSize();
    if (sa == 0) {
      return n;
    }
    final int sn = n.getSize() < 0 ? -n.getSize() : n.getSize();
    if (sn == 0) {
      return a;
    }
    final int[] c = new int[sa > sn ? sa : sn];
    for (int i = 0; i < c.length; ++i) {
      c[i] = getDigit(a, i) | getDigit(n, i);
    }
    return tidyResult(c, c.length, (a.getSize() | n.getSize()) < 0);
  }

  /**
   * Return the bitwise xor of this integer with <code>n</code>.
   * The sign bits are also xored; thus the result is negative
   * if and only if one of the inputs is negative.
   *
   * @param a first number
   * @param n number to and
   * @return <code>this ^ n</code>
   */
  static Z xor(final Z a, final Z n) {
    if (a.equals(n)) {
      return Z.ZERO;
    }
    final int sa = a.getSize() < 0 ? -a.getSize() : a.getSize();
    final int sn = n.getSize() < 0 ? -n.getSize() : n.getSize();
    if (sa == 0) {
      return n;
    }
    if (sn == 0) {
      return a;
    }
    final int[] c = new int[sa > sn ? sa : sn];
    for (int i = 0; i < c.length; ++i) {
      c[i] = getDigit(a, i) ^ getDigit(n, i);
    }
    return tidyResult(c, c.length, (a.getSize() ^ n.getSize()) < 0);
  }

  /**
   * Return this integer with the specified bit cleared. This operation
   * never changes the sign unless the result becomes zero.
   *
   * @param n number
   * @param bitNumber bit number to clear
   * @return integer with the bit cleared
   * @exception ArithmeticException if <code>bitNumber</code> is negative.
   */
  static Z clearBit(final Z n, final int bitNumber) {
    // for efficiency, if possible we avoid copying the number
    if (bitNumber < 0) {
      throw new ArithmeticException();
    }

    // compute relevant digit
    int digit = bitNumber / Z.BASE_BITS;
    // this is probably faster than doing %
    final int mask = 1 << (bitNumber - digit * Z.BASE_BITS);

    // return immediately if bit is already clear
    if ((getDigit(n, digit) & mask) == 0) {
      return n;
    }

    if (n.getSize() >= 0) {
      // the positive case is comparatively easily
      final Z r = n.copy();
      r.mValue[digit] &= ~mask;
      if (digit == n.getSize() - 1) {
        while (digit >= 0 && r.mValue[digit] == 0) {
          --digit;
        }
        if (digit == -1) {
          return Z.ZERO;
        }
        r.mSign = digit + 1;
      }
      return r;
    }

    // number is negative, this clear could make the number much longer
    // because of implicit sign extension, we know at this point that
    // the bit needs to be flipped
    final int[] r = new int[-n.getSize() > digit ? -n.getSize() : digit + 1];
    for (int i = 0; i < r.length; ++i) {
      r[i] = getDigit(n, i);
    }
    r[digit] &= ~mask;
    return tidyResult(r, r.length, true);
  }

  /**
   * Return this integer with the specified bit set. This operation
   * never changes the sign unless the result becomes zero.
   *
   * @param n number
   * @param bitNumber bit number to set
   * @return integer with the bit set
   * @exception ArithmeticException if <code>bitNumber</code> is negative.
   */
  static Z setBit(final Z n, final int bitNumber) {

    // for efficiency, if possible we avoid copying the number
    if (bitNumber < 0) {
      throw new ArithmeticException();
    }

    // compute relevant digit
    final int digit = bitNumber / Z.BASE_BITS;
    // this is probably faster than doing %
    final int mask = 1 << (bitNumber - digit * Z.BASE_BITS);

    // return immediately if bit is already set
    if ((getDigit(n, digit) & mask) != 0) {
      return n;
    }

    if (n.getSize() >= 0) {
      // the positive case is comparatively easily
      if (digit < n.getSize()) {
        final Z r = n.copy();
        r.mValue[digit] |= mask;
        return r;
      }
      final int[] c = new int[digit + 1];
      System.arraycopy(n.mValue, 0, c, 0, n.getSize());
      c[digit] = mask;
      return new Z(c, digit + 1);
    }

    //    final int[] r = new int[-n.getSize() > digit ? -n.getSize() : digit + 1];
    final int[] r = new int[-n.getSize()];
    for (int i = 0; i < r.length; ++i) {
      r[i] = getDigit(n, i);
    }
    r[digit] |= mask;
    return tidyResult(r, r.length, true);
  }

  /**
   * Toggle the designated bit on an integer.
   *
   * @param a number
   * @param n bit position to toggle
   * @return integer with toggled bit
   * @exception ArithmeticException if <code>n</code>&lt;0.
   */
  static Z flipBit(final Z a, final int n) {
    if (n < 0) {
      throw new ArithmeticException();
    }
    if (a.getSize() == 0) {
      return Z.ONE.shiftLeft(n);
    }
    final int digit = n / Z.BASE_BITS;
    final int mask = 1 << (n - Z.BASE_BITS * digit);
    final boolean sign = a.getSize() < 0;
    int size = sign ? -a.getSize() : a.getSize();

    if (size <= digit) {
      return sign ? clearBit(a, n) : setBit(a, n);
    }

    final int[] r = new int[size];
    if (a.getSize() > 0) {
      // handle easy positive case
      System.arraycopy(a.mValue, 0, r, 0, size);
      r[digit] ^= mask;
      while (--size >= 0 && r[size] == 0) {
        // DO NOTHING
      }
      return new Z(r, size + 1);
    }

    // number is negative
    for (int i = 0; i < size; ++i) {
      r[i] = getDigit(a, i);
    }
    r[digit] ^= mask;
    return tidyResult(r, size, true);
  }

  /**
   * Return bit <code>n</code> of this integer as a boolean. Numbers
   * have implicit sign extension.
   *
   * @param a number to test
   * @param n bit position
   * @return value of the bit
   * @exception ArithmeticException if <code>n</code> is negative.
   */
  static boolean testBit(final Z a, final int n) {
    if (n < 0) {
      throw new ArithmeticException();
    }
    if (a.getSize() == 0) {
      return false;
    }
    final int bl = n / Z.BASE_BITS;
    final int wh = 1 << (n - Z.BASE_BITS * bl);
    final int sa = a.getSize() < 0 ? -a.getSize() : a.getSize();
    if (sa < bl) {
      return a.getSize() < 0;
    }
    return (getDigit(a, bl) & wh) != 0;
  }

}
