package irvine.oeis.a068;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068324 Number of nondecreasing arithmetic progressions of positive odd integers with sum n.
 * @author Sean A. Irvine
 */
public class A068324 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 2; k <= mN; ++k) {
      sum = sum.add(RING.coeff(RING.monomial(Z.ONE, k), RING.multiply(RING.oneMinusXToTheN(2 * k), RING.oneMinusXToTheN(k * (k - 1)), mN), mN));
    }
    return sum.add(mN & 1);
  }
}
