package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003292.
 * @author Sean A. Irvine
 */
public class A003292 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> den = RING.one();
    for (int k = 1; k <= mN; ++k) {
      den = RING.multiply(den, RING.pow(RING.oneMinusXToTheN(k), k > 2 ? 2 : 1), mN);
    }
    return RING.coeff(RING.one(), den, mN);
  }
}
