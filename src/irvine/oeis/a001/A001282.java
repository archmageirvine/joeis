package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.MultivariatePolynomialField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001282 Number of permutations of length n by rises.
 * @author Sean A. Irvine
 */
public class A001282 implements Sequence {

  private static final MultivariatePolynomialField<Z> RING1 = new MultivariatePolynomialField<>(IntegerField.SINGLETON, 2);
  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final MultivariatePolynomial<Z> NUM = new MultivariatePolynomial<>(IntegerField.SINGLETON, 2, new int[][] {{2, 0}, {3, 0}, {2, 1}, {3, 1}, {1, 0}}, Z.TWO, Z.NEG_ONE, Z.TWO.negate(), Z.ONE, Z.NEG_ONE);
  private static final MultivariatePolynomial<Z> DEN = new MultivariatePolynomial<>(IntegerField.SINGLETON, 2, new int[][] {{2, 0}, {2, 1}, {0, 0}}, Z.ONE, Z.NEG_ONE, Z.NEG_ONE);
  private int mN = 2 * order() - 1;

  protected int order() {
    return 3;
  }

  @Override
  public Z next() {
    MultivariatePolynomial<Z> num = new MultivariatePolynomial<>(IntegerField.SINGLETON, 2, new int[][] {{0, 0}}, Z.ONE);
    MultivariatePolynomial<Z> den = num;
    ++mN;
    // This is a bit of a guess on these constraints
    final int[] lim = {mN + 1, order()};
    Polynomial<Z> p = RING.one();
    Z f = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      f = f.multiply(k);
      num = num.multiply(NUM, lim);
      den = den.multiply(DEN, lim);
      final Polynomial<Z> s = RING1.series(num, den, order(), mN);
      p = RING.add(p, RING.multiply(s, f));
    }
    return p.coeff(mN).divide2();
  }

}
