package irvine.oeis.a046;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046042 Number of partitions of n into fourth powers.
 * @author Sean A. Irvine
 */
public class A046042 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1, k4; (k4 = k * k * k * k) <= mN; ++k) {
      prod = RING.multiply(prod, RING.oneMinusXToTheN(k4), mN);
    }
    return RING.coeff(RING.one(), prod, mN);
  }
}
