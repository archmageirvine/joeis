package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008485 Coefficient of x^n in Product_{k&gt;=1} 1/(1-x^k)^n.
 * @author Sean A. Irvine
 */
public class A008485 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> den = RING.one();
    for (int k = 1; k <= mN; ++k) {
      den = RING.multiply(den, RING.pow(RING.oneMinusXToTheN(k), mN, mN), mN);
    }
    return RING.coeff(RING.one(), den, mN);
  }
}
