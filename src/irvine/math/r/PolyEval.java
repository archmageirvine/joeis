package irvine.math.r;

/**
 * Polynomial evaluation functions used by several of the math utility classes.
 *
 * @author Sean A. Irvine
 */
final class PolyEval {

  private PolyEval() { }

  /**
   * Evaluate a polynomial at a given value. Computes
   * <code>p(x) = (...(((p0 * x) + p1) * x + p2) * x ...) * x + pn</code>.
   * Behaviour is undefined for <code>x = Double.NEGATIVE_INFINITY</code>.
   *
   * @param x point to evaluate polynomial at
   * @param p coefficients of polynomial
   * @return p(x)
   * @exception NullPointerException if <code>p</code> is null
   * @exception ArrayIndexOutOfBoundsException if <code>p</code> has length
   * less than 2.
   */
  static double polyeval(final double x, final double[] p) {
    double a = p[0];
    int i = 1;
    do {
      a *= x;
      a += p[i];
    } while (++i < p.length);
    return a;
  }

  /**
   * Evaluate a polynomial where the leading coefficient is 1. That is,
   * <code>p(x) = (...((x + p1) * x + p2) * x ...) * x + pn</code>.
   * Behaviour is undefined for <code>x = Double.NEGATIVE_INFINITY</code>.
   *
   * @param x point to evaluate polynomial at
   * @param p coefficients of polynomial (excluding leading 1)
   * @return p(x)
   * @exception NullPointerException if <code>p</code> is null
   * @exception ArrayIndexOutOfBoundsException if <code>p</code> is length 0.
   */
  static double p1eval(final double x, final double[] p) {
    double a = x + p[0];
    for (int i = 1; i < p.length; ++i) {
      a *= x;
      a += p[i];
    }
    return a;
  }

  /**
   * Evaluate the series <code>sum_{i=1}^{N-1}c[i]*T_i(x/2)</code> of Chebyshev
   * polynomials T_i at argument x/2. The coefficients c[i] are
   * stored in reverse order; that is, the zero order term is the
   * last term in the array. N is this equation is c.length.
   *
   * If coefficients are for the interval a to b, then x must
   * have been transformed to <code>x -&gt; 2(2x - b - a) / (b - a)</code> before
   * entering the routine. This maps x from (a,b) to (-1,1),
   * over which the Chebyshev polynomials are defined.
   *
   * If the coefficients are for the inverted interval, in which
   * <code>(a,b)</code> is mapped to <code>(1/b,1/a)</code>, the transformation required
   * is <code>x -&gt; 2(2a/x - b - a) / (b - a)</code>. If b is infinity, then
   * this becomes <code>x -&gt; 4a/x - 1</code>.
   *
   * @param x point to evaluate
   * @param c coefficients
   * @return series sum
   * @exception NullPointerException if <code>p</code> is null
   * @exception ArrayIndexOutOfBoundsException if <code>p</code> is length 0.
   */
  static double chebyshev(final double x, final double[] c) {
    double b0 = c[0];
    double b1 = 0;
    double b2 = 0;
    for (int i = 1; i < c.length; ++i) {
      b2 = b1;
      b1 = b0;
      b0 = x * b1 - b2 + c[i];
    }
    return 0.5 * (b0 - b2);
  }

}
