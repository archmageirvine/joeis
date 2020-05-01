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

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /**
   * Construct <code>1/L</code> for Dirichlet series <code>L</code>
   * @param series Dirichlet series
   * @return inverse series
   */
  public static List<Z> inverse(final List<Z> series) {
    return RING.series(RING.one(), RING.create(series).shift(-1), series.size() - 1).shift(1);
  }
}
