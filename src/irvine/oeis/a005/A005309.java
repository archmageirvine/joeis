package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005309 Fermionic string states.
 * @author Sean A. Irvine
 */
public class A005309 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> num = RING.one();
    Polynomial<Z> den = RING.one();
    for (int k = 1; k <= mN; ++k) {
      num = RING.multiply(num, RING.pow(RING.onePlusXToTheN(k), k - 1, mN), mN);
      den = RING.multiply(den, RING.pow(RING.oneMinusXToTheN(k), k - 1, mN), mN);
    }
    return RING.coeff(num, den, mN);
  }
}
