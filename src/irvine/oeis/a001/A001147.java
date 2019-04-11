package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001147 Double factorial of odd numbers: <code>a(n) = (2*n-1)!! = 1*3*5*</code>...*(2*n-1).
 * @author Sean A. Irvine
 */
public class A001147 implements Sequence {

  private Z mPrev = Z.NEG_ONE;
  private long mN = -3;

  @Override
  public Z next() {
    mN += 2;
    mPrev = mPrev.multiply(mN);
    return mPrev;
  }
}
