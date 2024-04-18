package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055376 CIK transform of Pascal's triangle A007318.
 * @author Sean A. Irvine
 */
public class A055376 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mRow = null;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN == 0) {
        return Z.ZERO;
      }
      mM = 0;
      mRow = RING.zero();
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final int d = dd.intValue();
        mRow = RING.add(mRow, RING.multiply(RING.pow(RING.onePlusXToTheN(d), mN / d, mN), Functions.PHI.z(dd).multiply(Z.ONE.shiftLeft(mN / d).subtract(1))));
      }
    }
    return mRow.coeff(mM).divide(mN);
  }
}
