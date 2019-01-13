package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002658.
 * @author Sean A. Irvine
 */
public class A002658 implements Sequence {

  private Z mSum = null;
  private Z mPrev = null;
  

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
      return Z.ONE;
    }
    if (mPrev == null) {
      mPrev = Z.ONE;
    } else {
      final Z t = mSum.multiply(mPrev).add(mPrev.multiply(mPrev.add(1)).divide2());
      mSum = mSum.add(mPrev);
      mPrev = t;
    }
    return mPrev;
  }
}
