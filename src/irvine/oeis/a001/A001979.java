package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001979 Number of partitions of floor(7n/2) into n nonnegative integers each no more than 7.
 * @author Sean A. Irvine
 */
public class A001979 implements Sequence {

  private static final MultivariatePolynomial<Z> NUM = MultivariatePolynomial.one(IntegerField.SINGLETON, 2);
  private static final MultivariatePolynomial<Z> DEN;

  static {
    MultivariatePolynomial<Z> p = MultivariatePolynomial.one(IntegerField.SINGLETON, 2);
    for (int k = 0; k <= 7; ++k) {
      p = p.multiply(new MultivariatePolynomial<>(IntegerField.SINGLETON, 2, new int[][] {{0, 0}, {1, k}}, Z.ONE, Z.NEG_ONE));
    }
    DEN = p;
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> s = MultivariatePolynomial.series(NUM, DEN, 7 * mN / 2, mN);
    return s.coeff(mN);
  }
}
