package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034939 a(n) is smallest number such that a(n)^2 + 1 is divisible by 5^n.
 * @author Sean A. Irvine
 */
public class A034939 implements Sequence {

  private Z mT = null;
  private Z mPrev = null;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
      return Z.ZERO;
    } else {
      mT = mT.multiply(5);
      mPrev = mPrev == null ? Z.TWO : mPrev.modPow(Z.FIVE, mT);
    }
    return mPrev.min(mT.subtract(mPrev));
  }
}
