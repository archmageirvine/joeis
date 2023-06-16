package irvine.math.z;

/**
 * Powering.
 * @author Sean A. Irvine
 */
final class Pow {

  private Pow() { }

  /**
   * Powering.  Computes this integer to the power of <code>exponent</code>.
   * @param b base
   * @param exponent exponent
   * @return <code>b^exponent</code>
   * @exception ArithmeticException if <code>exponent</code> is negative
   * and power would entail a non-integral result.
   */
  static Z pow(final Z b, final Z exponent) {
    // x^0
    if (exponent.getSize() == 0) {
      return Z.ONE;
    }
    // 0^x
    if (b.getSize() == 0) {
      return Z.ZERO;
    }
    // x^1
    if (Z.ONE.equals(exponent)) {
      return b;
    }
    if (b.getSize() == 1) {
      // 1^x
      if (b.mValue[0] == 1) {
        return Z.ONE;
      }
      // 2^x
      if (b.mValue[0] == 2) {
        return Z.ONE.shiftLeft(exponent.longValue());
      }
    }
    // (-1)^x
    if (b.getSize() == -1 && b.mValue[0] == 1) {
      return (exponent.mValue[0] & 1) == 0 ? Z.ONE : b;
    }
    if (exponent.getSize() < 0) {
      throw new ArithmeticException();
    }
    Z bb = b;
    int k = 0;
    for (int i = exponent.getSize() - 1; i >= 0; --i) {
      final int j = exponent.mValue[i];
      if (k == 0) {
        k = 1;
        while ((k << 1) <= j) {
          k <<= 1;
        }
      }
      while ((k >>>= 1) != 0) {
        bb = Sqr.square(bb);
        if ((j & k) != 0) {
          bb = Mul.multiply(b, bb);
        }
      }
      k = Z.BASE;
    }
    return bb;
  }

  /**
   * Powering.  Computes this integer to the power of <code>exponent</code>.
   * @param b base
   * @param exponent exponent
   * @return <code>b^exponent</code>
   * @exception ArithmeticException if <code>exponent</code> is negative
   * and power would entail a non-integral result.
   */
  static Z pow(final Z b, final long exponent) {
    // x^0
    if (exponent == 0) {
      return Z.ONE;
    }
    // 0^x
    if (b.getSize() == 0) {
      return Z.ZERO;
    }
    // x^1
    if (exponent == 1) {
      return b;
    }
    if (b.getSize() == 1) {
      // 1^x
      if (b.mValue[0] == 1) {
        return Z.ONE;
      }
      // 2^x
      if (b.mValue[0] == 2) {
        if (exponent > Integer.MAX_VALUE) {
          throw new ArithmeticException();
        }
        return Z.ONE.shiftLeft(exponent);
      }
    }
    // (-1)^x
    if (b.getSize() == -1 && b.mValue[0] == 1) {
      return (exponent & 1) == 0 ? Z.ONE : b;
    }
    if (exponent < 0 || exponent > Integer.MAX_VALUE) {
      throw new ArithmeticException();
    }
    Z bb = b;
    final int j = (int) exponent;
    int k = 1;
    while ((k << 1) <= j) {
      k <<= 1;
    }
    while ((k >>>= 1) != 0) {
      bb = Sqr.square(bb);
      if ((j & k) != 0) {
        bb = Mul.multiply(b, bb);
      }
    }
    return bb;
  }
}
