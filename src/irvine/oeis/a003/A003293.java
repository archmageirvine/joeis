package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003293 Number of planar partitions of n decreasing across rows.
 * @author Sean A. Irvine
 */
public class A003293 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> den = RING.one();
    for (int k = 1; k <= mN; ++k) {
      den = RING.multiply(den, RING.pow(RING.oneMinusXToTheN(k), (k + 1) / 2), mN);
    }
    return RING.coeff(RING.one(), den, mN);
  }
}
