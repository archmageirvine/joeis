package irvine.math.polynomial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * Factorization of a polynomial over the rationals.
 *
 * <p>The factors are primitive polynomials with integer coefficients,
 * represented as polynomials over Q. The rational constant factor is
 * returned separately by {@link #unit()}.</p>
 *
 * <p>The factorization algorithm currently uses Kronecker's method.
 * Integer values occurring during the computation are factored using
 * the existing Jaguar integer factorizer.</p>
 *
 * @author Sean A. Irvine
 */
public final class PolynomialFactorSequence {

  private static final PolynomialRingField<Z> ZR = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final PolynomialRingField<Q> R = new PolynomialRingField<>(Rationals.SINGLETON);

  /** The rational unit. */
  private Q mUnit;

  /** The factors and their multiplicities. */
  private final Map<Polynomial<Q>, Integer> mFactors = new LinkedHashMap<>();

  /**
   * Construct the factorization of a rational polynomial.
   *
   * @param p polynomial to factor
   */
  public PolynomialFactorSequence(final Polynomial<Q> p) {
    if (p == null) {
      throw new NullPointerException();
    }
    if (p.degree() < 0) {
      throw new IllegalArgumentException("Cannot factor zero polynomial");
    }

    mUnit = p.degree() == 0 ? p.coeff(0) : Q.ONE;

    if (p.degree() <= 0) {
      return;
    }

    final Primitive primitive = primitivePart(p);
    mUnit = primitive.mUnit;
    factor(primitive.mPolynomial);
    sortFactors();
  }

  /**
   * Return the rational constant factor.
   *
   * @return unit
   */
  public Q unit() {
    return mUnit;
  }

  /**
   * Return the number of distinct factors.
   *
   * @return number of factors
   */
  public int size() {
    return mFactors.size();
  }

  /**
   * Return the factor at the specified index.
   *
   * @param n index
   * @return factor
   */
  public Polynomial<Q> factor(final int n) {
    return new ArrayList<>(mFactors.keySet()).get(n);
  }

  /**
   * Return the exponent of the factor at the specified index.
   *
   * @param n index
   * @return exponent
   */
  public int exponent(final int n) {
    return mFactors.get(factor(n));
  }

  /**
   * Return the factors and their multiplicities.
   *
   * @return factors
   */
  public Map<Polynomial<Q>, Integer> asMap() {
    return Collections.unmodifiableMap(mFactors);
  }

  /**
   * Return true if there are no nonconstant factors.
   *
   * @return true for a constant polynomial
   */
  public boolean isTrivial() {
    return mFactors.isEmpty();
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    if (!Q.ONE.equals(mUnit)) {
      sb.append(mUnit);
    }
    for (final Map.Entry<Polynomial<Q>, Integer> e : mFactors.entrySet()) {
      if (sb.length() > 0) {
        sb.append(" * ");
      }
      sb.append('(').append(e.getKey()).append(')');
      if (e.getValue() != 1) {
        sb.append('^').append(e.getValue());
      }
    }
    return sb.toString();
  }

  /**
   * Factor a primitive integer polynomial, returning rational factors.
   */
  private void factor(final Polynomial<Q> p) {
    if (p.degree() <= 1) {
      addFactor(p);
      return;
    }

    /*
     * First try a rational root. This is a cheap special case and also
     * prevents Kronecker's method from doing unnecessary work on polynomials
     * which have linear factors.
     */
    final Polynomial<Q> linear = findLinearFactor(p);
    if (linear != null) {
      final Polynomial<Q> q = R.divide(p, linear);
      factor(linear);
      factor(q);
      return;
    }

    final Polynomial<Q> g = kroneckerFactor(p);
    if (g == null) {
      addFactor(p);
      return;
    }

    final Polynomial<Q> q = R.divide(p, g);
    factor(g);
    factor(q);
  }

  /**
   * Find a linear factor, if one exists.
   *
   * <p>The polynomial is assumed to have integer coefficients and to be
   * primitive. Rational roots are tested using the rational-root theorem.</p>
   */
  private static Polynomial<Q> findLinearFactor(final Polynomial<Q> p) {
    final Polynomial<Z> z = toIntegerPolynomial(p);

    final Z a0 = z.coeff(0);
    final Z an = z.leadingCoeff();

    /*
     * x is a factor if a0 = 0.
     */
    if (a0.isZero()) {
      return Polynomial.create(Q.ZERO, Q.ONE);
    }

    final FactorSequence numeratorFactors = Jaguar.factor(a0.abs());
    final FactorSequence denominatorFactors = Jaguar.factor(an.abs());

    final Z[] numerators = numeratorFactors.divisors();
    final Z[] denominators = denominatorFactors.divisors();

    for (final Z a : numerators) {
      for (final Z b : denominators) {
        if (b.isZero()) {
          continue;
        }

        final Q r = new Q(a, b);
        if (R.eval(p, r).isZero()) {
          return R.create(List.of(r.negate(), Q.ONE));
        }

        final Q rn = r.negate();
        if (R.eval(p, rn).isZero()) {
          return R.create(List.of(r, Q.ONE));
        }
      }
    }
    return null;
  }

  /**
   * Apply Kronecker's method to find one proper factor.
   *
   * @param p primitive polynomial
   * @return a proper factor, or null if irreducible
   */
  private static Polynomial<Q> kroneckerFactor(final Polynomial<Q> p) {
    final Polynomial<Z> f = toIntegerPolynomial(p);
    final int degree = f.degree();
    final int maxFactorDegree = degree / 2;

    /*
     * Collect enough evaluation points for the largest possible factor.
     * Integer roots are skipped since we want nonzero values to factor.
     */
    final List<Z> points = new ArrayList<>();
    final List<Z> fvalues = new ArrayList<>();
    final List<Z[]> divisors = new ArrayList<>();

    int x = 0;
    while (points.size() <= maxFactorDegree) {
      final Z xx = Z.valueOf(x++);
      final Z value = ZR.eval(f, xx);
      if (!value.isZero()) {
        final FactorSequence fs = Jaguar.factor(value.abs());
        final Z[] d = fs.divisors();

        /*
         * Include both signs.
         */
        final Z[] signed = new Z[2 * d.length];
        for (int k = 0; k < d.length; ++k) {
          signed[k] = d[k];
          signed[k + d.length] = d[k].negate();
        }

        points.add(xx);
        fvalues.add(value);
        divisors.add(signed);
      }
    }

    final Z[][] choices = divisors.toArray(new Z[0][]);
    final Z[] values = new Z[points.size()];
    final Polynomial<Q> fq = PolynomialUtils.zToQ(f);

    /*
     * Search by factor degree.  A degree d polynomial is determined by
     * d+1 values, so there is no reason to choose divisors at all
     * maxFactorDegree+1 points before attempting interpolation.
     */
    for (int d = 1; d <= maxFactorDegree; ++d) {
      final Polynomial<Q> result =
        searchKronecker(fq, points, fvalues, choices, values, 0, d);
      if (result != null) {
        return result;
      }
    }

    return null;
  }

  /**
   * Recursive divisor-combination search for a factor of specified degree.
   *
   * @param f polynomial being factored
   * @param points evaluation points
   * @param fvalues values of f at the evaluation points
   * @param choices possible signed divisors at each point
   * @param values current selected values for a candidate factor
   * @param pos current position
   * @param degree desired degree
   * @return a proper factor, or null
   */
  private static Polynomial<Q> searchKronecker(final Polynomial<Q> f,
                                               final List<Z> points,
                                               final List<Z> fvalues,
                                               final Z[][] choices,
                                               final Z[] values,
                                               final int pos,
                                               final int degree) {
    /*
     * A polynomial of degree degree is uniquely determined by degree+1
     * values, so construct and test the candidate now.
     */
    if (pos > degree) {
      final List<Z> xs = points.subList(0, degree + 1);
      final Z[] ys = new Z[degree + 1];
      System.arraycopy(values, 0, ys, 0, degree + 1);

      final Polynomial<Q> candidate = interpolate(xs, ys);

      /*
       * The interpolation must really have the requested degree.
       */
      if (candidate.degree() != degree) {
        return null;
      }

      /*
       * Genuine primitive integer factors have integer coefficients.
       */
      for (final Q c : candidate) {
        if (!c.isInteger()) {
          return null;
        }
      }

      /*
       * Check the remaining evaluation points before doing polynomial
       * division.  If c divides f, then c(x) must divide f(x).
       */
      final Polynomial<Q> c = primitiveQ(candidate);
      final Polynomial<Z> cz = toIntegerPolynomial(c);
      for (int k = degree + 1; k < points.size(); ++k) {
        final Z cv = ZR.eval(cz, points.get(k));
        if (cv.isZero() || !fvalues.get(k).mod(cv).isZero()) {
          return null;
        }
      }

      /*
       * Final exact verification.
       */
      if (R.mod(f, c).degree() < 0) {
        return c;
      }

      return null;
    }

    for (final Z v : choices[pos]) {
      values[pos] = v;
      final Polynomial<Q> result =
        searchKronecker(f, points, fvalues, choices, values,
          pos + 1, degree);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  /**
   * Interpolate a polynomial through integer-valued points.
   */
  private static Polynomial<Q> interpolate(final List<Z> x, final Z[] y) {
    final Map<Q, Q> tuples = new LinkedHashMap<>();
    for (int k = 0; k < x.size(); ++k) {
      tuples.put(new Q(x.get(k)), new Q(y[k]));
    }
    return R.lagrange(tuples);
  }

  /**
   * Add a factor, accumulating its multiplicity.
   */
  private void addFactor(final Polynomial<Q> p) {
    if (p.degree() <= 0) {
      mUnit = mUnit.multiply(p.coeff(0));
      return;
    }

    final Polynomial<Q> q = primitiveQ(p);
    final Integer e = mFactors.get(q);
    mFactors.put(q, e == null ? 1 : e + 1);
  }

  /**
   * Sort factors deterministically.
   */
  private void sortFactors() {
    final List<Map.Entry<Polynomial<Q>, Integer>> entries = new ArrayList<>(mFactors.entrySet());
    entries.sort(Comparator
      .comparingInt((Map.Entry<Polynomial<Q>, Integer> e) -> e.getKey().degree())
      .thenComparing(e -> e.getKey().toString()));
    mFactors.clear();
    for (final Map.Entry<Polynomial<Q>, Integer> e : entries) {
      mFactors.put(e.getKey(), e.getValue());
    }
  }

  /**
   * Extract the primitive integer polynomial and rational unit.
   */
  private static Primitive primitivePart(final Polynomial<Q> p) {
    Z lcm = Z.ONE;

    for (final Q c : p) {
      lcm = lcm.divide(lcm.gcd(c.den())).multiply(c.den());
    }

    final Z[] a = new Z[p.size()];
    Z content = Z.ZERO;

    for (int k = 0; k < p.size(); ++k) {
      a[k] = p.coeff(k).num().multiply(lcm.divide(p.coeff(k).den()));
      content = content.isZero() ? a[k].abs() : content.gcd(a[k]);
    }

    if (content.isZero()) {
      throw new IllegalArgumentException("Zero polynomial");
    }

    for (int k = 0; k < a.length; ++k) {
      a[k] = a[k].divide(content);
    }

    Q unit = new Q(content, lcm);

    if (a[a.length - 1].signum() < 0) {
      for (int k = 0; k < a.length; ++k) {
        a[k] = a[k].negate();
      }
      unit = unit.negate();
    }

    return new Primitive(PolynomialUtils.zToQ(Polynomial.create(a)), unit);
  }

  /**
   * Convert a primitive Q polynomial to a primitive Z polynomial.
   */
  private static Polynomial<Z> toIntegerPolynomial(final Polynomial<Q> p) {
    Z lcm = Z.ONE;

    for (final Q c : p) {
      lcm = lcm.divide(lcm.gcd(c.den())).multiply(c.den());
    }

    final Z[] a = new Z[p.size()];
    for (int k = 0; k < p.size(); ++k) {
      a[k] = p.coeff(k).num().multiply(lcm.divide(p.coeff(k).den()));
    }

    Z content = Z.ZERO;
    for (final Z c : a) {
      content = content.isZero() ? c.abs() : content.gcd(c);
    }

    if (!content.isZero() && !Z.ONE.equals(content)) {
      for (int k = 0; k < a.length; ++k) {
        a[k] = a[k].divide(content);
      }
    }

    if (a[a.length - 1].signum() < 0) {
      for (int k = 0; k < a.length; ++k) {
        a[k] = a[k].negate();
      }
    }

    return Polynomial.create(a);
  }

  /**
   * Make a rational polynomial primitive, with positive leading coefficient.
   */
  private static Polynomial<Q> primitiveQ(final Polynomial<Q> p) {
    final Primitive primitive = primitivePart(p);
    return primitive.mPolynomial;
  }

  /**
   * Primitive polynomial together with its rational unit.
   */
  private static final class Primitive {
    private final Polynomial<Q> mPolynomial;
    private final Q mUnit;

    private Primitive(final Polynomial<Q> polynomial, final Q unit) {
      mPolynomial = polynomial;
      mUnit = unit;
    }
  }
}
