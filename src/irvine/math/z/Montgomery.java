package irvine.math.z;

/**
 * Implements Montgomery arithmetic for a given modulus.  When several
 * operations are to be performed using the same modulus this is faster
 * than using the classical algorithms.<p>
 *
 * @author Sean A. Irvine
 */
public class Montgomery {

  /**
   * Convert an inverse of n modulo p.
   *
   * @param n base
   * @param mod modulus
   * @return inverse
   */
  private static int inverse(final int n, final int mod) {
    final int p = Math.abs(mod);
    // case n<0 never happens here
    // case n>p also never happens here
    //    if (n < 0) {
    //      n = -n;
    //    }
    int w, r;
    //    if (n > p) {
    //      w = 0;
    //      r = p;
    //    } else {
      w = p / n;
      r = p - w * n;
      //    }
    int q = n;
    int nr = r;
    int u = 1;
    boolean par = false;
    while (nr != 0) {
      final int nq;
      if ((nr = q - r) < r) {
        nq = 1;
      } else if ((nr -= r) < r) {
        nq = 2;
      } else {
        nq = q / r;
        nr = q - nq * r;
      }
      final int nw = nq * w + u;
      u = w;
      w = nw;
      q = r;
      r = nr;
      par ^= true;
    }
    final int inv = par ? p - u : u;
    assert ((long) inv * (long) n) % p == 1;
    return inv;
  }

  /** The modulus. */
  private final Z mModulus;
  /** Modulus top value. */
  private final int mTop;
  /** Inverse. */
  private final int mInverse;
  private final Z mR;
  private final Z mRR;
  private final Z mRRR;
  //  private final Z mNM;

  /**
   * Construct a new Montgomery arithmetic for the given modulus.
   *
   * @param modulus modulus
   * @exception ArithmeticException if modulus is even or negative
   * @exception NullPointerException if modulus is null
   */
  public Montgomery(final Z modulus) {
    int top = modulus.getSize();
    if (top <= 0 || modulus.isEven()) {
      throw new ArithmeticException("Bad modulus");
    }
    mModulus = modulus;
    final int[] mValue = mModulus.getValue();
    mInverse = inverse(Z.BASE - mValue[0], Z.BASE);
    if (mValue[top - 1] >= (Z.BASE >>> 1)) {
      ++top;
    }
    mTop = top;
    final int[] xx = new int[mTop + 1];
    xx[mTop] = 1;
    final Z[] qr = new Z(xx, mTop + 1).divideAndRemainder(mModulus);
    mR = qr[1];
    mRR = mR.modSquare(mModulus);
    mRRR = mR.modMultiply(mRR, mModulus);
    //    mNM = mModulus.modSubtract(mR, mModulus);
  }

  /**
   * Get the modulus of this Montgomery arithmetic.
   *
   * @return modulus
   */
  public Z getModulus() {
    return mModulus;
  }

  /**
   * Convert an integer to its corresponding Montgomery value.
   *
   * @param a integer to convert
   * @return Montgomery value
   */
  public Z toMontgomery(final Z a) {
    if (a.signum() == 0) {
      return a;
    }
    return multiply(a.signum() < 0 || mModulus.compareTo(a) < 0 ? a.mod(mModulus) : a, mRR);
  }

  /**
   * Convert a number in Montgomery form to an ordinary integer.
   *
   * @param a Montgomery value
   * @return integer value
   */
  public Z toZ(final Z a) {
    if (a.signum() == 0) {
      return a;
    }
    return multiply(a, Z.ONE);
  }

  /**
   * Montgomery addition.
   *
   * @param a first value
   * @param b second value
   * @return <code>a - b</code>
   */
  public Z add(final Z a, final Z b) {
    return a.modAdd(b, mModulus);
  }


  /**
   * Montgomery subtraction.
   *
   * @param a first value
   * @param b second value
   * @return <code>a - b</code>
   */
  public Z subtract(final Z a, final Z b) {
    return a.modSubtract(b, mModulus);
  }

  /**
   * Montgomery multiplication.
   *
   * @param a multiplicand
   * @param b multiplicand
   * @return <code>a * b</code>
   */
  public Z multiply(final Z a, final Z b) {
    if (b.signum() == 0 || a.signum() == 0) {
      return Z.ZERO;
    }
    final Z x;
    if (a.getSize() <= b.getSize()) {
      x = Mul.karMul(b, a, 0);
    } else {
      x = Mul.karMul(a, b, 0);
    }

    // this copy is a shame
    final int[] cc = new int[(mTop << 1) + 1];
    System.arraycopy(x.getValue(), 0, cc, 0, x.getSize());

    final int[] nn = mModulus.getValue();
    final int blen = mModulus.getSize();
    for (int i = 0; i < mTop; ++i) {
      final int s = (mInverse * cc[i]) & Z.BASE_MASK;
      int k = i;
      int carry = 0;
      for (int j = 0; j < blen; ++j, ++k) {
        final int bb = nn[j];
        final int tt = cc[k] + carry;
        final int aa = (tt + bb * s) & Z.BASE_MASK;
        carry = (int) (0.25 + Z.BASE_INV * (((double) (tt - aa)) + (double) bb * (double) s));
        cc[k] = aa;
      }
      if (((cc[k] += carry) & Z.BASE) != 0) {
        cc[k++] &= Z.BASE_MASK;
        cc[k]++;
      }
    }

    // copy down result over fractional part
    System.arraycopy(cc, mTop, cc, 0, mTop);

    int clen = mTop;
    while (clen-- > 0 && cc[clen] == 0) {
      // DO NOTHING
    }
    final Z c = new Z(cc, clen + 1);
    if (c.compareTo(mModulus) >= 0) {
      return Sub.sub(c, mModulus);
    }
    return c;
  }

  /**
   * Montgomery multiplication.
   *
   * @param a multiplicand
   * @param b multiplicand
   * @return <code>a * b</code>
   */
  public Z multiply(final Z a, final long b) {
    return a.modMultiply(b, mModulus);
  }

  /**
   * Montgomery squaring.
   *
   * @param a number to square
   * @return <code>a^2</code>
   */
  public Z square(final Z a) {
    if (a.signum() == 0) {
      return Z.ZERO;
    }
    final Z x = Sqr.karSqr(a, 0);

    // this copy is a shame
    final int[] cc = new int[(mTop << 1) + 1];
    System.arraycopy(x.getValue(), 0, cc, 0, x.getSize());

    final int[] nn = mModulus.getValue();
    final int blen = mModulus.getSize();
    for (int i = 0; i < mTop; ++i) {
      final int s = (mInverse * cc[i]) & Z.BASE_MASK;
      int k = i;
      int carry = 0;
      for (int j = 0; j < blen; ++j, ++k) {
        final int bb = nn[j];
        final int tt = cc[k] + carry;
        final int aa = (tt + bb * s) & Z.BASE_MASK;
        cc[k] = aa;
        carry = (int) (0.25 + Z.BASE_INV * (((double) (tt - aa)) + (double) bb * (double) s));
      }
      if (((cc[k] += carry) & Z.BASE) != 0) {
        cc[k++] &= Z.BASE_MASK;
        cc[k]++;
      }
    }

    // copy down result over fractional part
    System.arraycopy(cc, mTop, cc, 0, mTop);

    int clen = mTop;
    while (clen-- > 0 && cc[clen] == 0) {
      // DO NOTHING
    }
    final Z c = new Z(cc, clen + 1);
    if (c.compareTo(mModulus) >= 0) {
      return Sub.sub(c, mModulus);
    }
    return c;
  }

  /**
   * Montgomery division.
   *
   * @param a number
   * @param b divisor
   * @return <code>a / b</code>
   * @exception ArithmeticException if <code>b</code> is 0 or the quotient is undefined.
   */
  public Z divide(final Z a, final Z b) {
    if (b.signum() == 0) {
      throw new ArithmeticException("Division by zero.");
    }
    if (a.signum() == 0) {
      return Z.ZERO;
    }
    Z g = a.gcd(b);
    if (Z.ONE.equals(g)) {
      g = b.modInverse(mModulus);
      if (b.auxiliary() != 0) {
        throw new ArithmeticException("Undefined quotient.");
      }
      g = multiply(g, a);
    } else {
      final Z nb = b.divide(g);
      final Z h = nb.modInverse(mModulus);
      if (nb.auxiliary() != 0) {
        throw new ArithmeticException("Undefined quotient.");
      }
      g = multiply(h, a.divide(g));
    }
    return multiply(g, mRRR);
  }

  /**
   * Montgomery inverse.
   *
   * @param a number to compute inverse of
   * @return inverse
   * @exception ArithmeticException if no inverse is possible.
   */
  public Z inverse(final Z a) {
    if (a.signum() == 0) {
      throw new ArithmeticException("Division by zero.");
    }
    final Z inv = a.modInverse(mModulus);
    if (a.auxiliary() != 0) {
      throw new ArithmeticException("Undefined quotient.");
    }
    return multiply(inv, mRRR);
  }

  /**
   * Montgomery power.
   *
   * @param a base
   * @param e exponent
   * @return <code>a^e</code>
   * @exception ArithmeticException if the request is impossible
   */
  public Z pow(final Z a, final Z e) {
    if (e.signum() == 0) {
      return mR;
    }
    if (a.signum() == 0) {
      return a;
    }
    Z  b = a;
    int i = e.getSize();
    if (i < 0) {
      i = -i;
    }
    final int[] value = e.getValue();
    int k = 0;
    while (i != 0) {
      final int j = value[--i];
      if (k == 0) {
        k = 1;
        while ((k << 1) <= j) {
          k <<= 1;
        }
      }
      while ((k >>= 1) != 0) {
        b = square(b);
        if ((j & k) != 0) {
          b = multiply(a, b);
        }
      }
      k = Z.BASE;
    }
    return e.signum() < 0 ? inverse(b) : b;
  }

}
