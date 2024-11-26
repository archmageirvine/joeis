package irvine.math.dirichlet;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Functions for Dirichlet generating functions.
 * @author Sean A. Irvine
 */
public final class Dgf {

  private Dgf() {}

  private static final Ds ZERO = new AbstractDs() {
    @Override
    public Z coeff(final Z n) {
      return Z.ZERO;
    }
  };

  /**
   * The zero Dirichlet series, 0.
   * @return zero
   */
  public static Ds zero() {
    return ZERO;
  }

  private static final Ds ONE = new AbstractDs() {
    @Override
    public Z coeff(final Z n) {
      return Z.ONE.equals(n) ? Z.ONE : Z.ZERO;
    }
  };

  /**
   * The identity Dirichlet series, 1.
   * @return one
   */
  public static Ds one() {
    return ONE;
  }

  private static final Ds ZETA = new AbstractDs() {
    @Override
    public Z coeff(final Z n) {
      return Z.ONE;
    }
  };

  /**
   * Construct an empty Dirichlet series (initially equivalent to 0).
   * This series is backed by a map allowing for setting of individual terms.
   * @return empty Dirichlet series.
   */
  public static FiniteDs empty() {
    return new FiniteDs();
  }

  /**
   * Construct a Dirichlet series from a finite list of initial coefficients.
   * That is, construct <code>c[0] + c[1]/2^s + c[2]/3^s + ... + c[n]/(n+1)^s</code>
   * where <code>c</code> is <code>coefficients</code> and <code>n</code> is
   * <code>coefficients.length</code>
   * @param coefficients coefficients list
   * @return Dirichlet series
   */
  public static Ds from(final Z... coefficients) {
    final FiniteDs ds = empty();
    for (int k = 0; k < coefficients.length; ++k) {
      if (!coefficients[k].isZero()) {
        ds.put(Z.valueOf(k + 1), coefficients[k]);
      }
    }
    return ds;
  }

  /**
   * Construct a Dirichlet series from a finite list of initial coefficients.
   * That is, construct <code>c[0] + c[1]/2^s + c[2]/3^s + ... + c[n]/(n+1)^s</code>
   * where <code>c</code> is <code>coefficients</code> and <code>n</code> is
   * <code>coefficients.length</code>
   * @param coefficients coefficients list
   * @return Dirichlet series
   */
  public static Ds from(final long... coefficients) {
    final FiniteDs ds = empty();
    for (int k = 0; k < coefficients.length; ++k) {
      if (coefficients[k] != 0) {
        ds.put(Z.valueOf(k + 1), Z.valueOf(coefficients[k]));
      }
    }
    return ds;
  }

  /**
   * The Dirichlet generating function for <code>zeta(s)</code>.
   * @return <code>zeta(s)</code>
   */
  public static Ds zeta() {
    return ZETA;
  }

  /**
   * The Dirichlet generating function for <code>zeta(m*s)</code>.
   * @return <code>zeta(m*s)</code>
   */
  public static Ds zeta(final int m) {
    return m == 1 ? zeta() : new Zeta(m);
  }

  /**
   * The Dirichlet generating function for <code>zeta(m*s-c)</code>.
   * @return <code>zeta(m*s-c)</code>
   */
  public static Ds zeta(final int m, final int c) {
    return c == 0 ? zeta(m) : new Zeta(m, c);
  }

  private static final Ds INVERSE_ZETA = new AbstractDs() {
    @Override
    public Z coeff(final Z n) {
      return Functions.MOBIUS.z(n);
    }
  };

  /**
   * The Dirichlet generating function for <code>1/zeta(s)</code>.
   * @return <code>1/zeta(s)</code>
   */
  public static Ds inverseZeta() {
    return INVERSE_ZETA;
  }

  /**
   * The Dirichlet generating function for <code>1/zeta(m*s)</code>.
   * @return <code>zeta(m*s)</code>
   */
  public static Ds inverseZeta(final int m) {
    return m == 1 ? inverseZeta() : new InverseZeta(m);
  }

  /**
   * The Dirichlet generating function for <code>1/zeta(m*s-c)</code>.
   * @return <code>zeta(m*s)</code>
   */
  public static Ds inverseZeta(final int m, final int c) {
    return c == 0 ? inverseZeta(m) : new InverseZeta(m, c);
  }

  /**
   * Construct the negation of a Dirichlet series.
   * @param f series
   * @return <code>-f</code>
   */
  public static Ds negate(final Ds f) {
    return new Negate(f);
  }

  /**
   * Construct the sum of two Dirichlet series.
   * @param f first series
   * @param g second series
   * @return the product
   */
  public static Ds add(final Ds f, final Ds g) {
    return new Add(f, g);
  }

  /**
   * Construct the difference of two Dirichlet series.
   * @param f first series
   * @param g second series
   * @return the product
   */
  public static Ds subtract(final Ds f, final Ds g) {
    return new Subtract(f, g);
  }

  /**
   * Construct the product of two Dirichlet series.
   * @param f first series
   * @param g second series
   * @return the product
   */
  public static Ds multiply(final Ds f, final Ds g) {
    return new Multiply(f, g);
  }

  /**
   * Construct the scalar multiplication of a Dirichlet series.
   * @param f series
   * @param m multiplier
   * @return the product
   */
  public static Ds multiply(final Ds f, final Z m) {
    return new ScalarMultiply(f, m);
  }

  /**
   * Construct the scalar multiplication of a Dirichlet series.
   * @param f series
   * @param m multiplier
   * @return the product
   */
  public static Ds multiply(final Ds f, final long m) {
    return new ScalarMultiply(f, Z.valueOf(m));
  }

  /**
   * Construct the scalar division of a Dirichlet series.
   * @param f series
   * @param d divisor
   * @return the product
   */
  public static Ds divide(final Ds f, final Z d) {
    return new ScalarDivide(f, d);
  }

  /**
   * Construct the scalar division of a Dirichlet series.
   * @param f series
   * @param d divisor
   * @return the product
   */
  public static Ds divide(final Ds f, final long d) {
    return new ScalarDivide(f, Z.valueOf(d));
  }

  /**
   * Raise a Dirichlet generating function to a power.
   * @param f Dirichlet series
   * @param n power
   * @return <code>f^n</code>
   * @exception ArithmeticException if <code>n</code> is negative.
   */
  public static Ds pow(final Ds f, final long n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    // x^0, 1^n
    if (n == 0 || f == one()) {
      return one();
    }
    // 0^n
    if (f == zero()) {
      return f;
    }
    // x^2 (this case for efficiency)
    if (n == 2) {
      return multiply(f, f);
    }
    final Ds s = pow(multiply(f, f), n / 2);
    return (n & 1) == 0 ? s : multiply(s, f);
  }

  /**
   * Return the square of a Dirichlet generating function.
   * Equivalent to <code>multiply(f, f)</code>.
   * @param f Dirichlet series
   * @return squared series
   */
  public static Ds square(final Ds f) {
    return multiply(f, f);
  }

  /**
   * Return a string representation of the initial terms of a Dirichlet series
   * @param f Dirichlet series
   * @param maxDegree maximum term to include
   * @return string
   */
  public static String toString(final Ds f, final int maxDegree) {
    final StringBuilder sb = new StringBuilder();
    for (int k = 1; k <= maxDegree; ++k) {
      final Z c = f.coeff(k);
      if (!c.isZero()) {
        if (k == 1) {
          sb.append(c);
        } else {
          sb.append('+').append(c).append('/').append(k).append("^s");
        }
      }
    }
    return sb.toString();
  }
}
