package irvine.oeis.a318;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A318607 Triangle read by rows: T(n,k) is the number of sets of rooted hypertrees on a total of n unlabeled nodes with a total of k edges, (0 &lt;= k &lt; n).
 * @author Gregory Morse
 */
public class A318607 extends A318602 {
  @Override
  protected Polynomial<Q> row(final int n) {
    return forest(n).coeff(n);
  }
}
