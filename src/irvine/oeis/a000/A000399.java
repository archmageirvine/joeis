package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A000399 Unsigned Stirling numbers of first kind s(n,3).
 * @author Sean A. Irvine
 */
public class A000399 extends Sequence3 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 1;
  private Polynomial<Z> mP = Polynomial.create(1, 1);

  @Override
  public Z next() {
    mP = RING.multiply(mP, Polynomial.create(++mN, 1), 2);
    return mP.coeff(2);
  }
}

