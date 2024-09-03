package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A001147 Double factorial of odd numbers: a(n) = (2*n-1)!! = 1*3*5*...*(2*n-1).
 * @author Sean A. Irvine
 */
public class A001147 extends Sequence0 implements DirectSequence {

  private Z mPrev = Z.NEG_ONE;
  private int mN = -3;

  @Override
  public Z next() {
    mN += 2;
    mPrev = mPrev.multiply(mN);
    return mPrev;
  }

  @Override
  public Z a(final Z n) {
    return Functions.MULTIFACTORIAL.z(2, n.multiply(2).subtract(1));
  }

  @Override
  public Z a(final int n) {
    return Functions.MULTIFACTORIAL.z(2, 2L * n - 1);
  }

}
