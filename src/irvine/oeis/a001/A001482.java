package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001482 Expand {Product_{j=1..inf} (1-x^j) - 1 }^4 in powers of x.
 * @author Sean A. Irvine
 */
public class A001482 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = power() - 1;

  protected int power() {
    return 4;
  }

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= mN + 2; ++k) {
      p = RING.multiply(p, RING.oneMinusXToTheN(k), mN);
    }
    final Z t = RING.pow(RING.subtract(p, RING.one()), power(), mN).coeff(mN);
    return (mN & 1) == 0 ? t : t.negate();
  }
}
