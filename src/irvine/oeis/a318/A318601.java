package irvine.oeis.a318;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A318601 Triangle read by rows: T(n,k) is the number of hypertrees on n unlabeled nodes with k edges, (0 &lt;= k &lt; n).
 * @author Gregory Morse
 */
public class A318601 extends A318602 {
  @Override
  protected Polynomial<Q> row(final int n) {
    return unrooted(n);
  }
}
