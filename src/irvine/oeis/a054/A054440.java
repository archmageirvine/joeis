package irvine.oeis.a054;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A054440 Number of ordered pairs of partitions of n with no common parts.
 * @author Sean A. Irvine
 */
public class A054440 extends A000041 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mNum = RING.empty();
  private final Polynomial<Z> mDen = RING.empty();

  @Override
  public Z next() {
    final Z p = super.next();
    mNum.add(p.square());
    mDen.add(p);
    return RING.coeff(mNum, mDen, mN);
  }
}
