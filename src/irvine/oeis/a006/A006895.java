package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006895 Parenthesized one way gives the powers of 2: (1), (2), (1+3), ..., another way the powers of 3: (1), (2+1), (3+6), ....
 * @author Sean A. Irvine
 */
public class A006895 implements Sequence {

  private Z mA = null;
  private Z mTwoPower = Z.TWO;
  private Z mThreePower = Z.THREE;
  private boolean mIsTwo = true;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ONE;
    }
    if (mIsTwo) {
      mA = mTwoPower.subtract(mA);
      mTwoPower = mTwoPower.multiply2();
      mIsTwo = false;
      return mA;
    } else {
      final Z r = mThreePower.subtract(mA);
      if (r.compareTo(mTwoPower) > 0) {
        mA = mA.add(mTwoPower);
        final Z res = mTwoPower;
        mTwoPower = mTwoPower.multiply2();
        return res;
      }
      mThreePower = mThreePower.multiply(3);
      mA = r;
      mIsTwo = true;
      return r;
    }
  }
}
