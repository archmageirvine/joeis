package irvine.oeis.a035;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035301 Expansion of Sum_{n&gt;=0} (q^n / Product_{k=1..n+5} (1 - q^k)).
 * @author Sean A. Irvine
 */
public class A035301 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int j = 0; j <= mN; ++j) {
      Polynomial<Z> prod = RING.one();
      for (int k = 1; k <= j + 5 && k <= mN; ++k) {
        prod = RING.multiply(prod, RING.oneMinusXToTheN(k), mN);
      }
      sum = sum.add(RING.coeff(RING.monomial(Z.ONE, j), prod, mN));
    }
    return sum;
  }
}

