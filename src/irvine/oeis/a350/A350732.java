package irvine.oeis.a350;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A350732 Triangle read by rows: T(n,k) is the number of weakly connected oriented graphs on n labeled nodes with k arcs.
 * @author Gregory Morse
 */
public class A350732 extends A350731 {
  @Override
  protected Polynomial<Q> row(final int n, final int m, final Polynomial<Q> e) {
    return RING.log(digraphEgf(n, m, e), n).coeff(n);
  }
}
