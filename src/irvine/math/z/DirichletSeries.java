package irvine.math.z;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;

/**
 * Container for a Dirichlet series.
 * @author Sean A. Irvine
 */
public class DirichletSeries extends TreeMap<Z, Z> {

  // Note: The intent is to deprecate this version
  // New implementations should instead use Dgf and Ds

  // This class holds a (sparse) Dirichlet series of the form
  // v_1 / k_1^s + v_2 / k_2^s + v_3 / k_3^s + ...
  // where the k_i and v_i are stored as key and value in the underlying TreeMap.
  // Often the v_i are all 1.
  // Only nonzero terms are stored.
  //
  // Most of the methods here operate up to a specified "maximum degree"
  // on the value of the k_i.

  /** The unit Dirichlet series. */
  public static final DirichletSeries ONE = new DirichletSeries();
  static {
    ONE.put(Z.ONE, Z.ONE);
  }

  /**
   * Convert an ordinary list into a (sparse) Dirichlet series.
   * If <code>terms[i]=v</code>, then <code>v / i^s</code> is included in
   * the series.
   * @param terms list
   * @return Dirichlet series version
   */
  public static DirichletSeries fromList(final List<Z> terms) {
    final DirichletSeries ds = new DirichletSeries();
    for (int k = 0; k < terms.size(); ++k) {
      final Z t = terms.get(k);
      if (!t.isZero()) {
        ds.put(Z.valueOf(k), t);
      }
    }
    return ds;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    for (final Map.Entry<Z, Z> e : entrySet()) {
      if (Z.ONE.equals(e.getKey())) {
        sb.append(e.getValue());
      } else {
        sb.append('+').append(e.getValue()).append('/').append(e.getKey()).append("^s");
      }
    }
    return sb.toString();
  }

  /**
   * Return a coefficient of the series.
   * @param base denominator
   * @return coefficient
   */
  public Z coeff(final Z base) {
    final Z t = get(base);
    return t == null ? Z.ZERO : t;
  }

  /**
   * Return a coefficient of the series.
   * @param base denominator
   * @return coefficient
   */
  public Z coeff(final long base) {
    return coeff(Z.valueOf(base));
  }

  /**
   * Compute the Dirichlet product of two Dirichlet series.
   * @param ds other series
   * @param maxDegree degree limit
   * @return Dirichlet product
   */
  public DirichletSeries multiply(final DirichletSeries ds, final Z maxDegree) {
    final DirichletSeries c = new DirichletSeries();
    for (final Map.Entry<Z, Z> e1 : entrySet()) {
      for (final Map.Entry<Z, Z> e2 : ds.entrySet()) {
        final Z key = e1.getKey().multiply(e2.getKey());
        if (maxDegree == null || key.compareTo(maxDegree) <= 0) {
          final Z m = e1.getValue().multiply(e2.getValue());
          final Z u = c.get(key);
          c.put(key, u == null ? m : u.add(m));
        }
      }
    }
    return c;
  }

  /**
   * Multiply the Dirichlet series by a scalar.
   * @param n value to multiply by
   * @return Dirichlet series
   */
  public DirichletSeries multiply(final Z n) {
    final DirichletSeries c = new DirichletSeries();
    for (final Map.Entry<Z, Z> e : entrySet()) {
      c.put(e.getKey(), e.getValue().multiply(n));
    }
    return c;
  }

  /**
   * Square this Dirichlet series.
   * @param maxDegree maximum degree
   * @return Dirichlet series
   */
  public DirichletSeries square(final Z maxDegree) {
    return multiply(this, maxDegree);
  }

  /**
   * Square this Dirichlet series.
   * @param maxDegree maximum degree
   * @return Dirichlet series
   */
  public DirichletSeries square(final int maxDegree) {
    return multiply(this, maxDegree);
  }

  /**
   * Divide the Dirichlet series by a scalar.
   * @param n value to divide by
   * @return Dirichlet series
   */
  public DirichletSeries divide(final Z n) {
    final DirichletSeries c = new DirichletSeries();
    for (final Map.Entry<Z, Z> e : entrySet()) {
      c.put(e.getKey(), e.getValue().divide(n));
    }
    return c;
  }

  /**
   * Compute the Dirichlet product of two Dirichlet series.
   * @param ds other series
   * @param maxDegree degree limit
   * @return Dirichlet product
   */
  public DirichletSeries multiply(final DirichletSeries ds, final long maxDegree) {
    return multiply(ds, Z.valueOf(maxDegree));
  }

//  /**
//   * Compute the Dirichlet product of two Dirichlet series.
//   * @param ds other series
//   * @return Dirichlet product
//   */
//  public DirichletSeries multiply(final DirichletSeries ds) {
//    return multiply(ds, null);
//  }

  /**
   * Compute the power of a Dirichlet series.
   * @param n power
   * @param maxDegree maximum degree
   * @return Dirichlet series to given power
   * @exception ArithmeticException if <code>n</code> is negative.
   */
  public DirichletSeries pow(final Z n, final Z maxDegree) {
    if (n.signum() < 0) {
      throw new IllegalArgumentException();
    }
    // x^0
    if (n.isZero()) {
      return DirichletSeries.ONE;
    }
    if (isEmpty()) {
      return this; // 0^n
    }
    if (size() == 1 && get(Z.ONE) != null) {
      return this; // 1^n
    }
    // x^1
    if (Z.ONE.equals(n)) {
      return this;
    }
    final DirichletSeries s = multiply(this, maxDegree).pow(n.divide2(), maxDegree);
    return n.isEven() ? s : multiply(s, maxDegree);
  }

  /**
   * Compute the power of a Dirichlet series.
   * @param n power
   * @param maxDegree maximum degree
   * @return Dirichlet series to given power
   * @exception ArithmeticException if <code>n</code> is negative.
   */
  public DirichletSeries pow(final int n, final long maxDegree) {
    return pow(Z.valueOf(n), Z.valueOf(maxDegree));
  }

  /**
   * Given a Dirichlet series <code>L(s)</code> return <code>L(s-shift)</code>.
   * @param shift amount to shift
   * @return shifted series
   */
  public DirichletSeries shift(final long shift) {
    final DirichletSeries ds = new DirichletSeries();
    for (final Map.Entry<Z, Z> e : entrySet()) {
      ds.put(e.getKey(), e.getValue().multiply(e.getKey().pow(shift)));
    }
    return ds;
  }

  /**
   * Given a Dirichlet series <code>L(s)</code> return <code>L(s-1)</code>.
   * @return shifted series
   */
  public DirichletSeries shift() {
    return shift(1);
  }

  /**
   * Return a scaled version of this Dirichlet series.
   * This is equivalent to making the substitution <code>s^power</code>.
   * @param power power to apply
   * @param maxDegree maximum degree
   * @return scaled series
   */
  public DirichletSeries substitute(final int power, final Z maxDegree) {
    final DirichletSeries ds = new DirichletSeries();
    for (final Map.Entry<Z, Z> e : entrySet()) {
      final Z key = e.getKey().pow(power);
      if (key.compareTo(maxDegree) <= 0) {
        ds.put(key, e.getValue());
      }
    }
    return ds;
  }

  /**
   * Return a scaled version of this Dirichlet series.
   * This is equivalent to making the substitution <code>s^power</code>.
   * @param power power to apply
   * @param maxDegree maximum degree
   * @return scaled series
   */
  public DirichletSeries substitute(final int power, final long maxDegree) {
    return substitute(power, Z.valueOf(maxDegree));
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private Polynomial<Z> toPoly(final int maxDegree) {
    final Z[] terms = new Z[maxDegree + 1];
    Arrays.fill(terms, Z.ZERO);
    for (final Map.Entry<Z, Z> e : entrySet()) {
      final int key = e.getKey().intValueExact();
      if (key < terms.length) {
        terms[key] = e.getValue();
      }
    }
    return Polynomial.create(terms);
  }

  /**
   * Construct <code>1/L</code> for this Dirichlet series <code>L</code>
   * @param maxDegree maximum degree
   * @return inverse series
   */
  public DirichletSeries inverse(final int maxDegree) {
    // todo smarter implementation of this
    final Polynomial<Z> series = toPoly(maxDegree);
    final Polynomial<Z> inverse = RING.series(RING.one(), series.shift(-1), series.size() - 1).shift(1);
    final DirichletSeries ds = new DirichletSeries();
    for (int k = 0; k < inverse.size(); ++k) {
      if (!inverse.coeff(k).isZero()) {
        ds.put(Z.valueOf(k), inverse.coeff(k));
      }
    }
    return ds;
  }

}
