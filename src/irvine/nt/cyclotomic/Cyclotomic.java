package irvine.nt.cyclotomic;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.math.Mobius;

/**
 * Compute values of cyclotomic polynomials.
 *
 * @author Sean A. Irvine
 * @author A. Kruppa
 */
public final class Cyclotomic {

  private Cyclotomic() { }

  /**
   * If n is a perfect power of a prime, return that prime, otherwise return 1.
   *
   * @param n value to test
   * @return 1 or a prime
   */
  private static int isPrimePower(int n) {
    for (int i = 2; i * i <= n; ++i) {
      if (n % i == 0) {
        do {
          n /= i;
        } while (n % i == 0);
        return n == 1 ? i : 1;
      }
    }
    // n is prime
    return n;
  }

  /** Mobius cache. */
  private static Mobius sMobius = null;
  /** Largest index supported by the Mobius cache. */
  private static int sMobiusSize = -1;

  /**
   * Compute the values of Phi_n(x).
   * @param n n value
   * @param x x value
   * @return Phi_n(x)
   * @exception ArithmeticException if n is less than 1
   */
  public static Z cyclotomic(int n, Z x) {
    if (n < 0) {
      throw new ArithmeticException("n must be nonnegative");
    }
    if (n == 0) {
      return x;
    }
    if (n == 1) {
      return x.subtract(Z.ONE);
    }
    if (x.isZero()) {
      return Z.ONE;
    }
    if (Z.NEG_ONE.equals(x)) {
      if ((n & 1) == 1) {
        n <<= 1;
      } else {
        n >>= 1;
      }
      if (n == 1) {
        return Z.ZERO;
      }
      x = Z.ONE;
    }
    if (Z.ONE.equals(x)) {
      return Z.valueOf(isPrimePower(n));
    }
    Z p = Z.ONE;
    Z q = Z.ONE;
    if (n > sMobiusSize) {
      sMobiusSize = n;
      sMobius = new Mobius(n);
    }
    for (int i = 1; i <= n; ++i) {
      if (n % i == 0) {
        final int mu = sMobius.mobiusMu(n / i);
        if (mu != 0) {
          final Z t = x.pow(i).subtract(Z.ONE);
          if (mu == 1) {
            p = p.multiply(t);
          } else {
            q = q.multiply(t);
          }
        }
      }
    }
    final Z[] qr = p.divideAndRemainder(q);
    assert qr[1].isZero();
    return qr[0];
  }

  /**
   * Compute the values of Phi_n(x).
   * @param n n value
   * @param x x value
   * @return Phi_n(x)
   * @exception ArithmeticException if n is less than 1
   */
  public static Z cyclotomic(final int n, final long x) {
    return cyclotomic(n, Z.valueOf(x));
  }

  private static final CyclotomicPolynomials CYCLOTOMIC_POLYNOMIALS = new CyclotomicPolynomials();

  /**
   * Compute a cyclotomic polynomial.
   * @param n parameter
   * @return cyclotomic polynomial
   */
  public static Polynomial<Z> cyclotomic(final int n) {
    return CYCLOTOMIC_POLYNOMIALS.get(n);
  }

  /**
   * Compute a cyclotomic polynomial.
   * @param n parameter
   * @return cyclotomic polynomial
   */
  public static Polynomial<Z> inverse(final int n) {
    return CYCLOTOMIC_POLYNOMIALS.inverse(n);
  }
}

