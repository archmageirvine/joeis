package irvine.oeis.a001;

import java.util.Arrays;

import irvine.math.group.IntegerField;
import irvine.math.group.MultivariatePolynomialField;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001980 Number of partitions of floor(7n/2)-1 into n nonnegative integers each no greater than 7.
 * @author Sean A. Irvine
 */
public class A001980 extends Sequence0 {

  private static final MultivariatePolynomialField<Z> RING = new MultivariatePolynomialField<>(IntegerField.SINGLETON, 2);
  private static final MultivariatePolynomial<Z> NUM = RING.one();
  private static final MultivariatePolynomial<Z> DEN;

  static {
    MultivariatePolynomial<Z> p = MultivariatePolynomial.one(IntegerField.SINGLETON, 2);
    for (int k = 0; k <= 7; ++k) {
      p = p.multiply(new MultivariatePolynomial<>(IntegerField.SINGLETON, 2, new int[][] {{0, 0}, {1, k}}, Arrays.asList(Z.ONE, Z.NEG_ONE)));
    }
    DEN = p;
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Polynomial<Z> s = RING.series(NUM, DEN, 7 * mN / 2 - 1, mN);
    return s.coeff(mN);
  }
}
