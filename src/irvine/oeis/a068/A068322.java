package irvine.oeis.a068;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068308.
 * @author Sean A. Irvine
 */
public class A068322 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 2; k * k <= mN; ++k) {
      sum = sum.add(RING.coeff(RING.monomial(Z.ONE, k * k), RING.multiply(RING.oneMinusXToTheN(2 * k), RING.oneMinusXToTheN(k * (k - 1)), mN), mN));
    }
    return sum.add(mN & 1);
  }
}
