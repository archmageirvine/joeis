package irvine.oeis.a035;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035295 Expansion of sum ( q^n / product( 1-q^k, k=1..3*n), n=0..inf ).
 * @author Sean A. Irvine
 */
public class A035295 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int j = 0; j <= mN; ++j) {
      Polynomial<Z> prod = RING.one();
      for (int k = 1; k <= 3 * j && k <= mN; ++k) {
        prod = RING.multiply(prod, RING.oneMinusXToTheN(k), mN);
      }
      sum = sum.add(RING.coeff(RING.monomial(Z.ONE, j), prod, mN));
    }
    return sum;
  }
}

