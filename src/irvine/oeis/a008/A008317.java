package irvine.oeis.a008;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001790;

/**
 * A008317 Triangle of coefficients of expansions of powers of x in terms of Legendre polynomials P_n(x) over common denominator.
 * @author Sean A. Irvine
 */
public class A008317 extends A001790 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
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
    return mDen.multiply(2L * mM + 1)
      .multiply(Functions.FACTORIAL.z(mN))
      .shiftRight(s)
      .divide(Functions.FACTORIAL.z(s))
      .divide(Functions.MULTIFACTORIAL.z(mN + mM + 1));
  }
}
