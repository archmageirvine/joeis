package irvine.oeis.a060;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A060345 An expansion related to Yukawa coupling.
 * @author Sean A. Irvine
 */
public class A060345 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.FIVE;
    }
    final Sequence s = new A060041();
    s.next(); // 0
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(RING.coeff(RING.monomial(s.next().multiply(k).multiply(k).multiply(k), k), RING.oneMinusXToTheN(k), mN));
    }
    return sum;
  }
}
