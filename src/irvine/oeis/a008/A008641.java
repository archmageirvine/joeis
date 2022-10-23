package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008641 Number of partitions of n into at most 12 parts.
 * @author Sean A. Irvine
 */
public class A008641 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mDen;
  {
    Polynomial<Z> den = RING.one();
    for (int k = 1; k <= parts(); ++k) {
      den = RING.multiply(den, RING.oneMinusXToTheN(k));
    }
    mDen = den;
  }
  private int mN = -1;

  protected int parts() {
    return 12;
  }

  @Override
  public Z next() {
    return RING.coeff(RING.one(), mDen, ++mN);
  }
}

