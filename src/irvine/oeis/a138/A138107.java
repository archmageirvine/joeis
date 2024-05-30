package irvine.oeis.a138;

import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a333.A333361;

/**
 * A138107 Infinite square array: T(n,k) = number of directed multigraphs with loops with n arcs and k vertices; read by falling antidiagonals.
 * @author Sean A. Irvine
 */
public class A138107 extends A333361 {

  // After Andrew Howroyd

  @Override
  protected Polynomial<Z> edgesPoly(final int[] v, final int degree) {
    Polynomial<Z> prod = RING.one();
    for (int i = 1; i < v.length; ++i) {
      for (int j = 0; j < i; ++j) {
        final int g = Functions.GCD.i(v[i], v[j]);
        final int u = v[i] * v[j] / g;
        prod = RING.multiply(prod, RING.pow(RING.oneMinusXToTheN(u), 2 * g, degree), degree);
      }
    }
    for (final int j : v) {
      prod = RING.multiply(prod, RING.pow(RING.oneMinusXToTheN(j), j, degree), degree);
    }
    return prod;
  }
}
