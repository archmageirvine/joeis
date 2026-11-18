package irvine.math.graph;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * Exponential generating functions for everywhere-reducible digraphs.
 * @author Gregory Morse
 */
public final class EverywhereReducibleDigraphs {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private static Polynomial<Q> twiceMinusOne(final Polynomial<Q> f) {
    return RING.subtract(RING.multiply(f, Q.TWO), RING.one());
  }

  // T = x*(2*exp(T)-1)*(2*exp(T)-1-T).
  private static Polynomial<Q> tau(final int n) {
    Polynomial<Q> t = RING.zero();
    for (int k = 1; k <= n; ++k) {
      final Polynomial<Q> f = twiceMinusOne(RING.exp(t, k - 1));
      t = RING.multiply(f, RING.subtract(f, t), k - 1).shift(1);
    }
    return t;
  }

  private static Polynomial<Q> phi(final int n) {
    final Polynomial<Q> t = tau(n);
    final Polynomial<Q> f = RING.exp(t, n);
    final Polynomial<Q> g = twiceMinusOne(f);
    final Polynomial<Q> tf = RING.multiply(t, f, n);
    return RING.add(f, RING.series(RING.multiply(tf, g, n), RING.subtract(g, RING.multiply(tf, Q.TWO)), n));
  }

  // C = x*Phi(C).
  private static Polynomial<Q> blocks(final int n) {
    Polynomial<Q> c = RING.zero();
    if (n > 0) {
      final Polynomial<Q> p = phi(n - 1);
      for (int k = 1; k <= n; ++k) {
        c = RING.substitute(p.truncate(k - 1), c, k - 1).shift(1);
      }
    }
    return c;
  }

  private static Z egf(final Polynomial<Q> f, final int n) {
    return f.coeff(n).multiply(Functions.FACTORIAL.z(n)).toZ();
  }

  /**
   * Count flat everywhere-reducible digraphs.
   * @param n number of vertices other than the flat root
   * @return count
   */
  public static Z flat(final int n) {
    return egf(RING.exp(tau(n), n), n);
  }

  /**
   * Count flat everywhere-reducible digraphs with a marked return vertex.
   * @param n number of vertices other than the flat root and return vertex
   * @return count
   */
  public static Z flatReturn(final int n) {
    return egf(phi(n), n);
  }

  /**
   * Count single-entry single-exit blocks.
   * @param n number of vertices
   * @return count
   */
  public static Z block(final int n) {
    return egf(blocks(n), n);
  }

  /**
   * Count strong digraphs reducible from every entry.
   * @param n number of vertices
   * @return count
   */
  public static Z strong(final int n) {
    return egf(RING.substitute(RING.exp(tau(n - 1), n - 1), blocks(n - 1), n - 1), n - 1);
  }

  private EverywhereReducibleDigraphs() { }
}
