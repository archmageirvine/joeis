package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A064307 Triangle of coefficients of certain numerator polynomials N(n,x).
 * @author Sean A. Irvine
 */
public class A064307 extends A064308 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, -1);
  private Polynomial<Z> mRow = RING.one();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      if (++mN > 2) {
        mRow = RING.pow(C, mN - 1);
        for (int k = 1; k < mN; ++k) {
          mRow = RING.add(mRow, RING.multiply(RING.pow(C, mN - 1 - k), t(mN - 1, k).multiply(Functions.FACTORIAL.z(k))).shift(k));
        }
      }
      mM = 0;
    }
    return mRow.coeff(mM);
  }
}
