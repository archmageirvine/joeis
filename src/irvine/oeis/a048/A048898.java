package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048898 One of the two successive approximations up to 5^n for the 5-adic integer sqrt(-1). Here the 2 (mod 5) numbers (except for n=0).
 * @author Sean A. Irvine
 */
public class A048898 implements Sequence {

  private int mN = -1;
  private Z mFives = Z.ONE;
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mFives = mFives.multiply(5);
    if (mN > 1) {
      mA = mA.modPow(Z.FIVE, mFives);
    }
    return mA;
  }
}

