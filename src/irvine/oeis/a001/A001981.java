package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001981 Restricted partitions.
 * @author Sean A. Irvine
 */
public class A001981 implements Sequence {

  private static final MultivariatePolynomial<Z> NUM = MultivariatePolynomial.one(2);
  private static final MultivariatePolynomial<Z> DEN;

  static {
    MultivariatePolynomial<Z> p = MultivariatePolynomial.one(2);
    for (int k = 0; k <= 8; ++k) {
      p = p.multiply(new MultivariatePolynomial<>(IntegerField.SINGLETON, 2, new int[][] {{0, 0}, {1, k}}, Z.ONE, Z.NEG_ONE));
    }
    DEN = p;
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> s = MultivariatePolynomial.series(NUM, DEN, 4 * mN, mN);
    return s.coeff(mN);
  }
}
