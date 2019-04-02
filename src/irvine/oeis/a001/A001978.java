package irvine.oeis.a001;

import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001978 Number of partitions of 3n-1 into n nonnegative integers each no more than 6.
 * @author Sean A. Irvine
 */
public class A001978 implements Sequence {

  private static final MultivariatePolynomial NUM = MultivariatePolynomial.one(2);
  private static final MultivariatePolynomial DEN;

  static {
    MultivariatePolynomial p = MultivariatePolynomial.one(2);
    for (int k = 0; k <= 6; ++k) {
      p = p.multiply(new MultivariatePolynomial(2, new int[][] {{0, 0}, {1, k}}, Z.ONE, Z.NEG_ONE));
    }
    DEN = p;
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Polynomial<Z> s = MultivariatePolynomial.series(NUM, DEN, 3 * mN - 1, mN);
    return s.coeff(mN);
  }
}
