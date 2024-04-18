package irvine.math.polynomial;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import irvine.math.api.Field;
import irvine.math.c.C;
import irvine.math.c.ComplexField;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRing;
import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Utility functions for polynomials.
 * @author Sean A. Irvine
 */
public final class PolynomialUtils {

  private static final double THIRD = 1.0 / 3;

  private PolynomialUtils() { }

  /**
   * Test if <code>ax^2+bx+c=0 (mod p)</code> has root.
   * @param a square coefficient
   * @param b linear coefficient
   * @param c constant term
   * @param p prime modulus
   * @return true if the quadratic has a solution
   */
  public static boolean quadraticRootsExist(final Z a, final Z b, final Z c, final Z p) {
    final Z aa = a.mod(p);
    final Z bb = b.mod(p);
    final Z cc = c.mod(p);
    final Z t = aa.modMultiply(bb, p).modMultiply(cc, p);
    if (Z.TWO.equals(p)) {
      return t.isZero();
    }
    if (aa.isZero()) {
      return true;
    }
    final Z d = bb.square().subtract(aa.multiply(cc).multiply(4));
    return d.jacobi(p) >= 0;
  }

  /**
   * Test if <code>ax^2+bx+c=0 (mod p)</code> has root.
   * @param quadratic the quadratic
   * @param p prime modulus
   * @return true if the quadratic has a solution
   */
  public static boolean quadraticRootsExist(final Polynomial<Z> quadratic, final Z p) {
    if (quadratic.degree() > 2) {
      throw new IllegalArgumentException();
    }
    return quadraticRootsExist(quadratic.coeff(2), quadratic.coeff(1), quadratic.coeff(0), p);
  }

  /**
   * Return the number of roots of <code>x^3+bx^2+cx+d=0 (mod p)</code>.
   * @param b quadratic coefficient
   * @param c linear coefficient
   * @param d constant term
   * @param p prime modulus
   * @return number of roots
   */
  public static int numberRootsCubic(final Z b, final Z c, final Z d, final Z p) {
    final Z b2 = ZUtils.bestRemainder(b, p);
    final Z c2 = ZUtils.bestRemainder(c, p);
    final Z d2 = ZUtils.bestRemainder(d, p);
    Z root1 = null;
    for (Z i = Z.ZERO; i.compareTo(p) < 0; i = i.add(1)) {
      final Z t = b2.add(i).multiply(i).add(c2).multiply(i).add(d2).mod(p);
      if (t.isZero()) {
        root1 = i;
        break;
      }
    }
    if (root1 != null) {
      final Z e = b.add(root1);
      final Z f = c.add(e.multiply(root1));
      return quadraticRootsExist(Z.ONE, e, f, p) ? 3 : 1;
    }
    return 0;
  }

  private static final ComplexField C = ComplexField.SINGLETON;

  private static C discriminant(final C b, final C c, final C d) {
    final C bb = C.multiply(b, b);
    final C cc = C.multiply(c, c);
    final C bc = C.multiply(b, c);
    return C.add(C.subtract(C.add(C.subtract(C.multiply(C.multiply(d, d), 27), C.multiply(bc, bc)),
        C.multiply(C.multiply(C.multiply(bb, b), d), 4)),
        C.multiply(C.multiply(bc, d), 18)),
        C.multiply(C.multiply(cc, c), 4));
  }

  /**
   * Compute the roots of a cubic.
   * @param c1 squared coefficient
   * @param c2 linear coefficient
   * @param c3 constant constant
   * @return array of complex roots
   */
  public static C[] rootsCubic(final C c1, final C c2, final C c3) {
    final C disc = discriminant(c1, c2, c3);
    final C mc1over3 = C.multiply(c1, -THIRD);
    final C p3 = C.subtract(C.multiply(c2, 3), C.multiply(c1, c1));
    final C[] roots = new C[3];
    if (C.abs(disc) < Double.MIN_NORMAL) {
      if (C.abs(p3) < Double.MIN_NORMAL) {
        // triple root
        Arrays.fill(roots, mc1over3);
      } else {
        // double root
        roots[0] = C.divide(C.subtract(C.multiply(c1, c2), C.multiply(c3, 9)), C.add(p3, p3));
        roots[1] = roots[0];
        roots[2] = C.negate(C.add(C.add(roots[0], roots[0]), c1));
      }
    } else {
      // distinct roots
      final C q = C.add(C.multiply(C.add(C.multiply(C.add(mc1over3, c1), mc1over3), c2), mc1over3), c3);
      final C w = C.multiply(new C(-1,  Math.sqrt(3)), 0.5);
      if (C.abs(p3) < Double.MIN_NORMAL) {
        // pure cubic
        roots[0] = C.pow(C.negate(q), THIRD);
        roots[1] = C.multiply(roots[0], w);
        roots[2] = C.multiply(roots[1], w);
        roots[0] = C.add(roots[0], mc1over3);
        roots[1] = C.add(roots[1], mc1over3);
        roots[2] = C.add(roots[2], mc1over3);
      } else {
        final C d = C.add(C.multiply(C.multiply(q, q), 729), C.multiply(C.multiply(C.multiply(p3, p3), p3), 4));
        final C t1cubed = C.multiply(C.subtract(C.pow(d, 0.5), C.multiply(q, 27)), 0.5);
        final C t1 = C.pow(t1cubed, THIRD);
        final C t2 = C.multiply(t1, w);
        final C t3 = C.multiply(t2, w);
        roots[0] = C.multiply(C.subtract(C.subtract(t1, c1), C.divide(p3, t1)), THIRD);
        roots[1] = C.multiply(C.subtract(C.subtract(t2, c1), C.divide(p3, t2)), THIRD);
        roots[2] = C.multiply(C.subtract(C.subtract(t3, c1), C.divide(p3, t3)), THIRD);
      }
    }
    // Newton refinement of roots
    for (int k = 0; k < roots.length; ++k) {
      C z = roots[k];
      for (int j = 0; j < 3 /* number of refinement iterations */; ++j) {
        final C fz = C.add(C.multiply(C.add(C.multiply(C.add(z, c1), z), c2), z), c3);
        final C fdashz = C.add(C.multiply(C.add(C.multiply(z, 3), C.multiply(c1, 2)), z), c2);
        if (fdashz.re() >= Double.MIN_NORMAL || fdashz.im() >= Double.MIN_NORMAL) {
          z = C.subtract(z, C.divide(fz, fdashz));
        }
      }
      roots[k] = z;
    }
    return roots;
  }

  /**
   * Integer roots of a cubic.  May be limited due to precision problems.
   * @param a quadratic coefficient
   * @param b linear coefficient
   * @param c constant coefficient
   * @return list of integer roots (at most 3 long)
   */
  public static Set<Z> zRootsCubic(final Z a, final Z b, final Z c) {
    final C za = new C(a.doubleValue());
    final C zb = new C(b.doubleValue());
    final C zc = new C(c.doubleValue());
    final C[] croots = rootsCubic(za, zb, zc);
    final HashSet<Z> iroots = new HashSet<>();
    for (final C croot : croots) {
      final Z x = Z.valueOf((long) croot.re()); // Ugly precision yeuch!
      if (x.isZero()) {
        if (c.isZero()) {
          iroots.add(x);
        }
      } else {
        final Z cx = c.divide(x);
        if (x.multiply(cx).equals(c)) {
          if (x.add(a).multiply(x).add(b).add(cx).isZero()) {
            iroots.add(x);
          }
        }
      }
    }
    return iroots;
  }

  /**
   * Series expansion of the cube root of the polynomial <code>(1+x)</code> where
   * <code>x</code> is itself a polynomial.
   * @param x the polynomial
   * @param n the maximum degree to retain
   * @return power series
   */
  public static Polynomial<Q> cubeRootP(final Polynomial<Q> x, final int n) {
    final PolynomialRingField<Q> ring = new PolynomialRingField<>(Rationals.SINGLETON);
    Polynomial<Q> res = ring.one();
    Polynomial<Q> f = ring.one();
    Q coeff = Q.ONE;
    for (int k = 1; k <= n; ++k) {
      f = ring.multiply(f, x, n);
      coeff = coeff.multiply(Q.ONE_THIRD.subtract(k - 1)).divide(k);
      res = ring.add(res, ring.multiply(f, coeff));
    }
    return res;
  }

  private static final PolynomialRingField<Z> ZX = new PolynomialRingField<>("y", IntegerField.SINGLETON);
  /** Polynomial field over the rationals. */
  public static final PolynomialRingField<Q> QX = new PolynomialRingField<>("y", Rationals.SINGLETON);
  /** Bivariate polynomials over the rationals. */
  public static final PolynomialRingField<Polynomial<Q>> QXX = new PolynomialRingField<>(QX);
  private static final PolynomialRingField<Polynomial<Z>> ZXX = new PolynomialRingField<>(ZX);

  /**
   * Promote an integer polynomial to a rational polynomial.
   * @param p polynomial with integer coefficients
   * @return corresponding polynomial with rational coefficients
   */
  public static Polynomial<Q> zToQ(final Polynomial<Z> p) {
    final Polynomial<Q> res = QX.empty();
    for (final Z v : p) {
      res.add(new Q(v));
    }
    return res;
  }

  /**
   * Demote a rational polynomial to an integer polynomial.
   * @param p polynomial with rational coefficients
   * @return corresponding polynomial with integer coefficients
   */
  public static Polynomial<Z> qToZ(final Polynomial<Q> p) {
    final Polynomial<Z> res = ZX.empty();
    for (final Q v : p) {
      res.add(v.toZ());
    }
    return res;
  }

  /**
   * Promote an integer bivariate polynomial to a rational polynomial.
   * @param p polynomial with integer coefficients
   * @return corresponding polynomial with rational coefficients
   */
  public static Polynomial<Polynomial<Q>> zxToQx(final Polynomial<Polynomial<Z>> p) {
    final Polynomial<Polynomial<Q>> res = QXX.empty();
    for (final Polynomial<Z> v : p) {
      res.add(zToQ(v));
    }
    return res;
  }

  /**
   * Promote a rational bivariate polynomial to an integer polynomial.
   * @param p polynomial with rational coefficients
   * @return corresponding polynomial with integer coefficients
   */
  public static Polynomial<Polynomial<Z>> qxToZx(final Polynomial<Polynomial<Q>> p) {
    final Polynomial<Polynomial<Z>> res = ZXX.empty();
    for (final Polynomial<Q> v : p) {
      res.add(qToZ(v));
    }
    return res;
  }

  /**
   * Perform a shift of the inner variable of a bivariate polynomial.
   * @param ring ring for outer polynomial
   * @param t polynomial
   * @param shift amount to shift
   * @param <T> type of element
   * @return shifted polynomial
   */
  public static <T> Polynomial<Polynomial<T>> innerShift(final PolynomialRing<Polynomial<T>> ring, final Polynomial<Polynomial<T>> t, final int shift) {
    final Polynomial<Polynomial<T>> subs = ring.empty();
    for (final Polynomial<T> v : t) {
      subs.add(v.shift(shift));
    }
    return subs;
  }

  /**
   * Perform substitution of the inner variable of a bivariate polynomial.
   * @param ring ring for outer polynomial
   * @param t polynomial
   * @param power power to substitute
   * @param n degree limit
   * @param <T> type of element
   * @return substituted polynomial
   */
  public static <T> Polynomial<Polynomial<T>> innerSubstitute(final PolynomialRing<Polynomial<T>> ring, final Polynomial<Polynomial<T>> t, final int power, final int n) {
    final Polynomial<Polynomial<T>> subs = ring.empty();
    for (final Polynomial<T> v : t) {
      subs.add(v.substitutePower(power, n));
    }
    return subs;
  }

  /**
   * Substitute an identical power for every variable (if any) in a polynomial.
   * Substitute every variable (if any) with <code>v -&gt; v^power</code>.
   * @param fld underlying field
   * @param e polynomial or element
   * @param power exponent
   * @param <E> underlying field type
   * @param <F> polynomial of E type
   * @return substituted polynomial
   */
  @SuppressWarnings("unchecked")
  public static <E, F> E deepSubstitute(final Field<E> fld, final E e, final int power) {
    if (!(e instanceof Polynomial<?>)) {
      return e;
    }
    return (E) ((PolynomialRingField<F>) fld).deepSubstitute((Polynomial<F>) e, power);
  }

  /**
   * Inverse Euler transform of a (possibly) multivariate polynomial.
   * @param p bivariate polynomial
   * @param <E> underlying field type
   * @return inverse Euler transform
   */
  public static <E> Polynomial<E> inverseEuler(final Field<E> fld, final Polynomial<E> p) {
    // WARNING: Because of the log, in practice the ultimate underlying field here should be Q
    final int n = p.degree();
    final PolynomialRingField<E> r = new PolynomialRingField<>(fld);
    final Polynomial<E> q = r.log(p, n);
    return r.sum(1, n, i -> r.divide(r.multiply(r.deepSubstitute(q.truncate(n / i), i), fld.coerce(Functions.MOBIUS.i((long) i))), fld.coerce(i)));
  }

  /**
   * Euler transform of a (possibly) multivariate polynomial.
   * @param fld underlying field
   * @param p polynomial
   * @param <E> underlying field type
   * @return Euler transform
   */
  public static <E> Polynomial<E> eulerTransform(final Field<E> fld, final Polynomial<E> p) {
    final int n = p.degree();
    final PolynomialRingField<E> ring = new PolynomialRingField<>(fld);
    final Polynomial<E> sum = ring.sum(1, n, i -> ring.divide(deepSubstitute(ring, p.truncate(n / i), i), fld.coerce(i)));
    return ring.exp(sum, n);
  }

  /**
   * Lift a polynomial over a single variable to a polynomial over two variables with the supplied
   * polynomial becoming the outer variable.
   * @param p polynomial
   * @return lifted polynomial
   */
  public static Polynomial<Polynomial<Q>> lift(final Polynomial<Q> p) {
    final Polynomial<Polynomial<Q>> res = QXX.empty();
    for (final Q e : p) {
      res.add(QX.monomial(e, 0));
    }
    return res;
  }

  /**
   * Substitute the inner variable of a bivariate polynomial with the given polynomial.
   * @param ring inner ring
   * @param poly polynomial
   * @param subs substitution
   * @param maxDegree max degree to retain
   * @return substituted polynomial
   */
  public static <E> Polynomial<E> innerSubstitute(final PolynomialRing<E> ring, final Polynomial<Polynomial<E>> poly, final Polynomial<E> subs, final int maxDegree) {
    Polynomial<E> res = ring.zero();
    int k = 0;
    for (final Polynomial<E> p : poly) {
      res = ring.add(res, ring.substitute(p, subs, maxDegree - k).shift(k));
      ++k;
    }
    return res;
  }

  /**
   * Return the maximum absolute value of the coefficients of a polynomial.
   * @param poly polynomial
   * @return height
   */
  public static Z height(final Polynomial<Z> poly) {
    return poly.aggregate(Z.ZERO, (a, c) -> a.max(c.abs()));
  }

  /**
   * Return Bessel polynomial <code>y_n(x)</code>.
   * @param n index
   * @return Bessel polynomial
   */
  public static Polynomial<Q> besselY(final int n) {
    final Q[] c = new Q[n + 1];
    for (int k = 0; k <= n; ++k) {
      c[k] = new Q(Binomial.binomial(n + k, 2L * k).multiply(MemoryFactorial.SINGLETON.factorial(2 * k)), MemoryFactorial.SINGLETON.factorial(k).shiftLeft(k));
    }
    return Polynomial.create(c);
  }

  /**
   * Swap the variables of a bivariate polynomial.
   * @param inner inner ring
   * @param poly bivariate polynomial
   * @param <E> element type
   * @return swapped polynomial
   */
  public static <E> Polynomial<Polynomial<E>> swapVariables(final PolynomialRing<E> inner, final Polynomial<Polynomial<E>> poly) {
    // x <--> y
    final int n = poly.degree();
    final Polynomial<Polynomial<E>> res = new PolynomialRing<>(inner).empty();
    for (int k = 0; k <= n; ++k) {
      final Polynomial<E> coeff = inner.empty();
      for (int j = 0; j <= n; ++j) {
        coeff.add(poly.coeff(j).coeff(k));
      }
      res.add(coeff);
    }
    return res;
  }
}
