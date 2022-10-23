package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000955 A sequence satisfying (a(2n+1) + 1)^3 = Sum_{k=1..2n+1} a(k)^3.
 * @author Sean A. Irvine
 */
public class A000955 extends Sequence1 {

  private Z mOdd = null;
  private Z mEven = null;
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mOdd == null && mEven == null) {
      mOdd = Z.ONE;
      return Z.ONE;
    }
    if (mEven == null) {
      mEven = Z.SIX;
      mOdd = null;
      return mEven;
    }
    if (mOdd == null) {
      mOdd = Z.EIGHT;
      return mOdd;
    }
    if (mFirst) {
      mEven = mOdd.square().multiply(3).add(mOdd.multiply(8)).add(6);
      mOdd = mOdd.pow(3).multiply(3).add(mOdd.square().multiply(12)).add(mOdd.multiply(17)).add(8);
    }
    mFirst = !mFirst;
    return mFirst ? mOdd : mEven;
  }
}
