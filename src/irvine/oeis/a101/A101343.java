package irvine.oeis.a101;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A101343.
 * @author Sean A. Irvine
 */
public class A101343 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> DTAN = Polynomial.create(1, 0, 1);
  private Polynomial<Z> mD = RING.x();
  private int mM = 2;

  @Override
  public Z next() {
    while (true) {
      if (--mM < 0) {
        mD = RING.multiply(RING.diff(mD), DTAN);
        mM = mD.degree();
      }
      final Z coeff = mD.coeff(mM);
      if (!Z.ZERO.equals(coeff)) {
        return coeff;
      }
    }
  }
}
