package irvine.oeis.a008;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008293 Triangle of coefficients in expansion of D^n (tan x) in powers of tan x.
 * @author Sean A. Irvine
 */
public class A008293 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> DTAN = Polynomial.create(1, 0, 1);
  private Polynomial<Z> mD = RING.x();
  private int mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM > mD.degree()) {
        mD = RING.multiply(RING.diff(mD), DTAN);
        mM = 0;
      }
      final Z coeff = mD.coeff(mM);
      if (!coeff.isZero()) {
        return coeff;
      }
    }
  }
}
