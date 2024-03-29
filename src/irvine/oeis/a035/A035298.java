package irvine.oeis.a035;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035298 Expansion of sum ( q^n / product( 1-q^k, k=1..6*n), n=0..inf ).
 * @author Sean A. Irvine
 */
public class A035298 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int j = 0; j <= mN; ++j) {
      Polynomial<Z> prod = RING.one();
      for (int k = 1; k <= 6 * j && k <= mN; ++k) {
        prod = RING.multiply(prod, RING.oneMinusXToTheN(k), mN);
      }
      sum = sum.add(RING.coeff(RING.monomial(Z.ONE, j), prod, mN));
    }
    return sum;
  }
}

