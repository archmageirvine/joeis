package irvine.oeis.a082;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082631 Enumeration of fractal 321 avoiders.
 * @author Sean A. Irvine
 */
public class A082631 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C0 = Polynomial.create(0, 1, 1);
  private static final Polynomial<Z> C1 = Polynomial.create(0, -2, 2);
  private static final Polynomial<Z> C2 = Polynomial.create(3, -3, 1);
  private static final Polynomial<Z> C3 = Polynomial.create(-1, -2);
  private static final Polynomial<Z> C4 = Polynomial.create(3, -2);
  private int mN = -1;
  private Polynomial<Z> mA = RING.x();

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = RING.add(
        RING.pow(mA, 6, mN),
        RING.multiply(RING.pow(mA, 4, mN), C4, mN),
        RING.multiply(RING.pow(mA, 3, mN), C3, mN),
        RING.multiply(RING.pow(mA, 2, mN), C2, mN),
        RING.multiply(mA, C1, mN),
        C0);
    }
    return mA.coeff(mN);
  }
}
