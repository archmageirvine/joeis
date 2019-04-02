package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A000550 Number of trees of diameter 7.
 * @author Sean A. Irvine
 */
public class A000550 extends A000235 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private Polynomial<Z> mA = RING.zero();
  private int mN = -1;

  @Override
  public Z next() {
    do {
      mA = RING.add(mA, RING.monomial(super.next(), ++mN));
    } while (mN < 6);
    return RING.add(RING.pow(mA, 2, mN), mA.substitutePower(2, mN)).coeff(mN).divide(2);
  }
}

