package irvine.oeis.a339;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A339232 Total number of interior vertices in the multigraphs of all oriented series-parallel networks with n edges.
 * @author Gregory Morse
 */
public class A339232 extends A339231 {
  private int mN = 0;

  @Override
  public Z next() {
    final Polynomial<Q> row = counts(++mN);
    Z sum = Z.ZERO;
    for (int k = 1; k <= row.degree(); ++k) {
      sum = sum.add(row.coeff(k).toZ().multiply(k));
    }
    return sum;
  }
}
