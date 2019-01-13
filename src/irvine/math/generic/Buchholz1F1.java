package irvine.math.generic;

import irvine.math.api.Exp;
import irvine.math.api.Field;
import irvine.math.api.Gamma;
import irvine.math.api.Pow;
import irvine.math.api.Sqrt;
import irvine.math.r.Constants;

/**
 * Implementation of hypergeometric functions for complex numbers.
 * @author Sean A. Irvine
 */
public final class Buchholz1F1 {

  private Buchholz1F1() { }

  private static final int MAX_ITERATIONS = 500;


  static <E extends Number, U extends Field<E> & Gamma<E> & Pow<E>> E besselJ(final U f, final E nu, final E z) {
    final E nup1 = f.add(nu, f.one());
    final E h = TaylorSeries0F1.hypergeometric(f, nup1, f.negate(f.divide(f.multiply(z, z), f.coerce(4))));
    final E t = f.pow(f.divide(z, f.coerce(2)), nu);
    return f.divide(f.multiply(t, h), f.gamma(nup1));
  }

  private static <E extends Number, U extends Field<E> & Gamma<E> & Pow<E>> E term(final U f, final E bm1, final E j, final E z, final E sqrtDisc, final E d) {
    final E nu = f.add(bm1, j);
    final E bj = besselJ(f, nu, sqrtDisc);
    final E pow = f.pow(sqrtDisc, nu);
    final E t = f.divide(bj, pow);
    //System.out.println("b" + j + "=" + bj + " pow=" + pow + " t=" + t);
    return f.multiply(d, f.multiply(f.pow(z, j), t));
  }

  /**
   * Compute <code>F(a;b;z)</code> using Buchholz polynomial method.
   * @param f field of elements
   * @param a upper parameter
   * @param b lower parameter
   * @param z argument
   * @param <E> element type
   * @param <U> field type
   * @return <code>F(a;b;z)</code> or null
   */
  public static <E extends Number, U extends Field<E> & Gamma<E> & Sqrt<E> & Pow<E> & Exp<E>> E hypergeometric(final U f, final E a, final E b, final E z) {
    final E one = f.one();
    final E two = f.add(one, one);
    final E bDiv2 = f.divide(b, two);
    E d0 = one;
    E d1 = f.zero();
    E d2 = bDiv2;

    final E gamma = f.gamma(b);
    final E bm1 = f.subtract(b, one);

    final E s0p = f.subtract(f.multiply(b, two), f.multiply(a, f.coerce(4)));
    final E disc = f.multiply(s0p, z);
    final E sqrtDisc = f.sqrt(disc);

    final E c = f.subtract(f.add(a, a), b);

    final E t0 = term(f, bm1, f.zero(), z, sqrtDisc, d0);
    final E t2 = term(f, bm1, two, z, sqrtDisc, d2);
    // Note t1 == 0
    //System.out.println("t0=" + t0);
    //System.out.println("t2=" + t2);

    E b1 = f.add(t0, t2);
    for (int j = 3; j < MAX_ITERATIONS; ++j) {
      final E ej = f.coerce(j);
      final E dn = f.divide(f.add(f.multiply(f.add(b, f.coerce(j - 2)), d1), f.multiply(c, d0)), ej);
      d0 = d1;
      d1 = d2;
      d2 = dn;

      final E tj = term(f, bm1, ej, z, sqrtDisc, dn);

      b1 = f.add(b1, tj);

      final double tol = tj.doubleValue() / b1.doubleValue();
      if (tol < Constants.MACHINE_PRECISION) {
        final E r0 = f.multiply(gamma, f.exp(f.divide(z, two)));
        final E r1 = f.multiply(r0, f.pow(two, bm1));
        return f.multiply(r1, b1);
      }
    }

    return null; // Failed to converge
  }
}
