package irvine.oeis.a001;

import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001975 Number of partitions of <code>floor(5n/2)</code> into n nonnegative integers each no more than 5.
 * @author Sean A. Irvine
 */
public class A001975 implements Sequence {

  private static final MultivariatePolynomial NUM = MultivariatePolynomial.one(2);
  private static final MultivariatePolynomial DEN;

  static {
    MultivariatePolynomial p = MultivariatePolynomial.one(2);
    for (int k = 0; k <= 5; ++k) {
      p = p.multiply(new MultivariatePolynomial(2, new int[][] {{0, 0}, {1, k}}, Z.ONE, Z.NEG_ONE));
    }
    DEN = p;
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final int w = 5 * mN / 2;
    //System.out.println(DEN);
    final Polynomial<Z> s = MultivariatePolynomial.series(NUM, DEN, w, mN);
    //System.out.println(s);
    return s.coeff(mN);
  }
}
