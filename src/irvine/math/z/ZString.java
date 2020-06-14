package irvine.math.z;

import irvine.util.string.StringUtils;

/**
 * Generate string representations of integers.
 *
 * @author Sean A. Irvine
 */
final class ZString {

  private ZString() { }

  /* Base 10 logarithm of the base. */
  private static final double BASE_LOG_10 = Math.log(Z.DBASE) / Math.log(10.0);

  /** Constants used in decimal string creation. */
  private static final int DIV;
  private static final int LDIV;
  private static final String ZEROS;
  static {
    int div = 10;
    int ldiv = 1;
    while (div * 10 < Z.BASE_ROOT) {
      div *= 10;
      ++ldiv;
    }
    DIV = div;
    LDIV = ldiv;
    final StringBuilder sb = new StringBuilder();
    for (int i = 1; i < LDIV; ++i) {
      sb.append('0');
    }
    ZEROS = sb.toString();
  }

  /**
   * Return the decimal representation of this integer as a string. The
   * result will be prepended with a minus sign if appropriate.
   *
   * @param n number
   * @return integer as a string.
   */
  static String toString(final Z n) {
    // more efficient than calling toString(10)
    if (n.getSize() == 0) {
      return "0";
    }
    final StringBuilder sb = new StringBuilder();
    final int sa;
    Z c;
    if (n.getSize() < 0) {
      sa = -n.getSize();
      sb.append('-');
      c = n.negate();
    } else {
      sa = n.getSize();
      c = n;
    }
    int i = -1;
    final int[] out = new int[(int) (BASE_LOG_10 * sa / LDIV) + 2];
    final long aux = n.mAuxiliary; // save this for later
    do {
      final Z cc = c.divide(DIV);
      out[++i] = (int) c.auxiliary();
      c = cc;
    } while (c.getSize() != 0);
    n.mAuxiliary = aux; // restore saved auxiliary
    sb.append(out[i--]);
    for (; i >= 0; --i) {
      int zeros = 10 * out[i];
      if (zeros != 0) {
        while (zeros < DIV) {
          sb.append('0');
          zeros *= 10;
        }
      } else {
        sb.append(ZEROS);
      }
      sb.append(out[i]);
    }

    return sb.toString();
  }

  /**
   * Return this integer as a string in the specified base.  The result
   * will be prefixed by a minus sign if appropriate.
   *
   * @param n number
   * @param base base
   * @return string representation.
   * @exception IllegalArgumentException if base is less than 2 or more
   * than 36.
   */
  static String toString(final Z n, final int base) {
    if (base == 10) {
      return toString(n);
    }
    if (base < 1) {
      throw new IllegalArgumentException("Base must be at least 1");
    }
    if (base > 36) {
      throw new IllegalArgumentException("Base must be at most 36");
    }
    if (n.getSize() == 0) {
      return "0";
    }
    if (base == 1) {
      final String tally = StringUtils.rep('1', Math.abs(n.intValueExact()));
      return n.getSize() < 0 ? "-" + tally : tally;
    }
    final StringBuilder sb = new StringBuilder();
    if (base == 2) {
      // special case can be done fast
      int sa;
      if (n.getSize() < 0) {
        sb.append('-');
        sa = -n.getSize();
      } else {
        sa = n.getSize();
      }
      int v = n.mValue[--sa];
      int m = Z.BASE >>> 1;
      while ((v & m) == 0) {
        m >>>= 1;
      }
      sb.append('1');
      while ((m >>>= 1) != 0) {
        sb.append((v & m) == 0 ? '0' : '1');
      }
      while (--sa >= 0) {
        v = n.mValue[sa];
        for (int k = Z.BASE >>> 1; k != 0; k >>>= 1) {
          sb.append((v & k) == 0 ? '0' : '1');
        }
      }
      return sb.toString();
    }

    Z a;
    if (n.getSize() < 0) {
      sb.append('-');
      a = n.negate();
    } else {
      a = n;
    }
    final int need = 5 + (int) a.log(base);
    final int[] s = new int[need];
    int k = -1;
    final long aux = n.mAuxiliary;
    do {
      final Z q = a.divide(base);
      s[++k] = (int) a.auxiliary();
      a = q;
    } while (a.getSize() != 0);
    n.mAuxiliary = aux;

    while (k >= 0) {
      final int c = '0' + s[k--];
      sb.append((char) (c > '9' ? c + 39 : c));
    }
    return sb.toString();
  }

  /**
   * Return this integer as a string in the specified base,
   * where each digit in base is represented by two decimal digits.
   * The result will be prefixed by a minus sign if appropriate,
   * and has no leading zero.
   *
   * @param n number
   * @param base base
   * @return string representation.
   * @exception IllegalArgumentException if base is less than 11 or more than 99.
   */
  static String toTwoDigits(final Z n, final int base) {
    if (base <  11) {
      throw new IllegalArgumentException("Base must be at least 11");
    }
    if (base > 99) {
      throw new IllegalArgumentException("Base must be at most 99");
    }
    if (n.getSize() == 0) {
      return "0";
    }
    final StringBuilder sb = new StringBuilder();
    Z a;
    if (n.getSize() < 0) {
      sb.append('-');
      a = n.negate();
    } else {
      a = n;
    }
    final int need = 5 + (int) a.log(base);
    final int[] s = new int[need];
    int k = -1;
    final long aux = n.mAuxiliary;
    do {
      final Z q = a.divide(base);
      s[++k] = (int) a.auxiliary();
      a = q;
    } while (a.getSize() != 0);
    n.mAuxiliary = aux;

    sb.append(String.format("%d", s[k--]));
    while (k >= 0) {
      sb.append(String.format("%02d", s[k--]));
    }
    return sb.toString();
  }
}
