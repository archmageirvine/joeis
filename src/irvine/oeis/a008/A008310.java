package irvine.oeis.a008;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008310 Triangle of coefficients of Chebyshev polynomials T_n <code>(x)</code>.
 * @author Sean A. Irvine
 */
public class A008310 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (mN < 1) {
      ++mN;
      return Z.ONE;
    }
    mM += 2;
    if (mM > mN) {
      ++mN;
      mM = mN & 1;
    }
    final int t = (mN + mM) / 2 - 1;
    final Z c = mF.factorial(t).multiply(mN).shiftLeft(mM - 1).divide(mF.factorial(mM)).divide(mF.factorial((mN - mM) / 2));
    return ((mN - mM) & 2) == 0 ? c : c.negate();
  }
}
