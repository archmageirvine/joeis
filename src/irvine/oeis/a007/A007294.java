package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007294.
 * @author Sean A. Irvine
 */
public class A007294 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> den = RING.one();
    int p;
    int k = 1;
    while ((p = Binomial.binomial(++k, 2).intValueExact()) <= mN) {
      den = RING.multiply(den, RING.oneMinusXToTheN(p), mN);
    }
    return RING.coeff(RING.one(), den, mN);
  }
}
