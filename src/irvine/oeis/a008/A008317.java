package irvine.oeis.a008;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.a001.A001790;

/**
 * A008317 Triangle of coefficients of expansions of powers of x in terms of Legendre polynomials P_n(x) over common denominator.
 * @author Sean A. Irvine
 */
public class A008317 extends A001790 {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;
  private Z mDen = null;

  @Override
  public Z next() {
    mM += 2;
    if (mM > mN) {
      mM = ++mN & 1;
      mDen = super.next();
    }
    final int s = (mN - mM) / 2;
    return mDen.multiply(2 * mM + 1)
      .multiply(mF.factorial(mN))
      .shiftRight(s)
      .divide(mF.factorial(s))
      .divide(mF.doubleFactorial(mN + mM + 1));
  }
}
