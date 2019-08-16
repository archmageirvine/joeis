package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025176 <code>a(n) =</code> Jacobi <code>P-Polynomial P_n(alpha=1, beta=1, x=sqrt(2))</code> multiplied by <code>2^(n/2+floor(n/2))</code> and divided by <code>n+1</code>.
 * @author Sean A. Irvine
 */
public class A025176 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.TWO;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return mN == 0 ? mA : mB;
    }
    final int pow = 2 - (mN & 1);
    final Z t = mB.multiply(2 * mN + 1).shiftLeft(pow)
      .subtract(mA.multiply(mN - 1).multiply(4))
      .divide(mN + 2);
    mA = mB;
    mB = t;
    return mB;
  }
}
