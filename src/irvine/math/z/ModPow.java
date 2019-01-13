package irvine.math.z;


/**
 * Modulo powers.
 *
 * @author Sean A. Irvine
 */
final class ModPow {

  private ModPow() { }

  /**
   * Compute powers with a modulus.  This is generally more efficient
   * than calling pow(exponent).mod(modulus) and prevents the intermediate
   * result becoming excessively large. Permits negative exponents where
   * it makes sense.
   *
   * @param n base
   * @param exponent exponent
   * @param modulus modulus
   * @return <code>this^exponent(mod modulus)</code>
   * @exception IllegalArgumentException for zero modulus.
   * @exception ArithmeticException for non-invertible quotients when
   * using negative exponents.
   */
  static Z modPow(final Z n, final Z exponent, final Z modulus) {
    if (modulus.mSign == 0) {
      throw new ArithmeticException();
    }
    if (Z.ONE.equals(modulus)) {
      return Z.ZERO;
    }
    int e = exponent.getSize();
    if (e == 0) {
      return Z.ONE;
    }
    if (n.getSize() == 0) {
      return Z.ZERO;
    }
    final Z m = Mod.mod(n, modulus);
    Z b = m;
    int k = 0;
    if (e < 0) {
      e = -e;
    }
    for (int i = e - 1; i >= 0; --i) {
      final int j = exponent.mValue[i];
      if (k == 0) {
        k = 1;
        while ((k << 1) <= j) {
          k <<= 1;
        }
      }
      while ((k >>>= 1) != 0) {
        b = b.modSquare(modulus);
        if ((j & k) != 0) {
          b = m.modMultiply(b, modulus);
        }
      }
      k = Z.BASE;
    }
    if (exponent.getSize() < 0) {
      final Z bb = b.modInverse(modulus);
      if (b.auxiliary() == 1L) {
        throw new ArithmeticException("Undefined quotient during invert.");
      }
      b = bb;
    }
    return b;
  }

}
