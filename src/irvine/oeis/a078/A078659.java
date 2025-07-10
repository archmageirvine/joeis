package irvine.oeis.a078;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078659 Expansion of 1/Product_{ n &gt;= 2, n not of the form 2^k-1 } (1+x^n).
 * @author Sean A. Irvine
 */
public class A078659 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 2; k <= mN; ++k) {
      if (!Predicates.POWER_OF_TWO.is(k + 1)) {
        prod = RING.multiply(prod, RING.onePlusXToTheN(k), mN);
      }
    }
    return RING.coeff(RING.one(), prod, mN);
  }
}
