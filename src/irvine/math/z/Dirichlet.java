package irvine.math.z;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.factor.factor.Cheetah;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;

/**
 * Utility functions relating to Dirichlet series.
 * @author Sean A. Irvine
 */
public final class Dirichlet {

  private Dirichlet() { }

  /**
   * Compute the Dirichlet product of two Dirichlet series.
   * @param a first series
   * @param b second series
   * @return Dirichlet product
   */
  public static List<Z> dirichletProduct(final List<Z> a, final List<Z> b) {
    final int lim = Math.min(a.size(), b.size());
    final ArrayList<Z> c = new ArrayList<>(lim);
    for (int k = 0; k < lim; ++k) {
      Z s = Z.ZERO;
      for (Z dd : Cheetah.factor(k).divisors()) {
        final int d = dd.intValue();
        s = s.add(a.get(d).multiply(b.get(k / d)));
      }
      c.add(s);
    }
    return c;
  }

  /**
   * Compute a zeta function as a Dirichlet series, <code>1/(1-p^(-s))</code>.
   * @param p prime
   * @param max maximum order
   * @param f coefficient
   * @return Dirichlet series
   */
  public static List<Z> zeta(final int p, final int max, final Z f) {
    final Z[] res = new Z[max + 1];
    Arrays.fill(res, Z.ZERO);
    res[1] = Z.ONE;
    Z u = f;
    for (int q = p; q <= max; q *= p, u = u.multiply(f)) {
      res[q] = u;
    }
    return Arrays.asList(res);
  }

  /**
   * Compute a zeta function as a Dirichlet series, <code>1+p^(-s)</code>.
   * @param p prime
   * @param max maximum order
   * @param f coefficient
   * @return Dirichlet series
   */
  public static List<Z> zetaNum(final int p, final int max, final Z f) {
    final Z[] res = new Z[max + 1];
    Arrays.fill(res, Z.ZERO);
    res[1] = Z.ONE;
    if (p <= max) {
      res[p] = f;
    }
    return Arrays.asList(res);
  }

  /**
   * Given a Dirichlet series <code>L(s)</code> return <code>L(s-1)</code>.
   * @param series Dirichlet series
   * @return shifted series
   */
  public static List<Z> shift(final List<Z> series) {
    final ArrayList<Z> res = new ArrayList<>(series.size());
    for (int k = 0; k < series.size(); ++k) {
      res.add(series.get(k).multiply(k));
    }
    return res;
  }

  /**
   * Return a scaled version of a Dirichlet series.
   * @param series Dirichlet series
   * @param power power to apply
   * @param max maximum term to retain
   * @return scaled series
   */
  public static List<Z> scale(final List<Z> series, final int power, final int max) {
    final List<Z> res = new ArrayList<>();
    final Z zmax = Z.valueOf(max);
    for (int k = 1; res.size() <= max; ++k) {
      final Z t = Z.valueOf(k).pow(power);
      if (t.compareTo(zmax) > 0) {
        // Ensure we fill out series to requested max
        while (res.size() <= max) {
          res.add(Z.ZERO);
        }
        return res;
      }
      final int ti = t.intValueExact();
      while (res.size() < ti) {
        res.add(Z.ZERO);
      }
      res.add(series.get(k));
    }
    return res;
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /**
   * Construct <code>1/L</code> for Dirichlet series <code>L</code>
   * @param series Dirichlet series
   * @return inverse series
   */
  public static List<Z> inverse(final List<Z> series) {
    return RING.series(RING.one(), RING.create(series).shift(-1), series.size() - 1).shift(1);
  }

  /**
   * Return a string representation of this Dirichlet series.
   * @param series Dirichlet series
   * @return string representation
   */
  public static String toString(final List<Z> series) {
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < series.size(); ++k) {
      if (!Z.ZERO.equals(series.get(k))) {
        if (k == 1) {
          sb.append(series.get(k));
        } else {
          sb.append('+').append(series.get(k)).append('/').append(k).append("^s");
        }
      }
    }
    return sb.toString();
  }
}
