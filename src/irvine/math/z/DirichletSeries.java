package irvine.math.z;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;

/**
 * Container for a Dirichlet series. This implementation only stores
 * nonzero terms.
 * @author Sean A. Irvine
 */
public class DirichletSeries extends TreeMap<Z, Z> {

  /**
   * Compute a zeta function as a Dirichlet series, <code>1/(1-p^(-s))</code>.
   * @param p prime
   * @param max maximum order
   * @param f scalar coefficient
   * @return Dirichlet series
   */
  public static DirichletSeries zeta(final int p, final long max, final Z f) {
    final DirichletSeries ds = new DirichletSeries();
    ds.put(Z.ONE, f);
    Z u = f;
    for (long q = p; q <= max; q *= p, u = u.multiply(f)) {
      ds.put(Z.valueOf(q), u);
    }
    return ds;
  }

  /**
   * Compute a zeta function as a Dirichlet series, <code>1+p^(-s)</code>.
   * @param p prime
   * @param max maximum order
   * @param f scalar coefficient
   * @return Dirichlet series
   */
  public static DirichletSeries zetaNum(final long p, final long max, final Z f) {
    final DirichletSeries ds = new DirichletSeries();
    ds.put(Z.ONE, Z.ONE);
    if (p <= max) {
      ds.put(Z.valueOf(p), f);
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
   * Return a coefficient of the series
   * @param base denominator
   * @return coefficient
   */
  public Z coeff(final Z base) {
    final Z t = get(base);
    return t == null ? Z.ZERO : t;
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
   * Compute the Dirichlet product of two Dirichlet series.
   * @param ds other series
   * @param maxDegree degree limit
   * @return Dirichlet product
   */
  public DirichletSeries multiply(final DirichletSeries ds, final long maxDegree) {
    return multiply(ds, Z.valueOf(maxDegree));
  }

  /**
   * Compute the Dirichlet product of two Dirichlet series.
   * @param ds other series
   * @return Dirichlet product
   */
  public DirichletSeries multiply(final DirichletSeries ds) {
    return multiply(ds, null);
  }

  /**
   * Given a Dirichlet series <code>L(s)</code> return <code>L(s-1)</code>.
   * @return shifted series
   */
  public DirichletSeries shift() {
    final DirichletSeries ds = new DirichletSeries();
    for (final Map.Entry<Z, Z> e : entrySet()) {
      ds.put(e.getKey(), e.getValue().multiply(e.getKey()));
    }
    return ds;
  }

  /**
   * Return a scaled version of this Dirichlet series.
   * @param power power to apply
   * @param max maximum term to retain
   * @return scaled series
   */
  public DirichletSeries scale(final int power, final Z max) {
    final DirichletSeries ds = new DirichletSeries();
    for (final Map.Entry<Z, Z> e : entrySet()) {
      final Z key = e.getKey().pow(power);
      if (key.compareTo(max) <= 0) {
        ds.put(key, e.getValue());
      }
    }
    return ds;
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private Polynomial<Z> toPoly(final int max) {
    final Z[] terms = new Z[max + 1];
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
   * @param max maximum degree
   * @return inverse series
   */
  public DirichletSeries inverse(final int max) {
    // todo smarter implementation of this
    final Polynomial<Z> series = toPoly(max);
    final Polynomial<Z> inverse = RING.series(RING.one(), series.shift(-1), series.size() - 1).shift(1);
    final DirichletSeries ds = new DirichletSeries();
    for (int k = 0; k < inverse.size(); ++k) {
      if (!Z.ZERO.equals(inverse.coeff(k))) {
        ds.put(Z.valueOf(k), inverse.coeff(k));
      }
    }
    return ds;
  }

}
