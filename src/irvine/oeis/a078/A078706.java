package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078706 a(n) = smallest integer &gt;=a(n-1) such that sum of first n terms is prime.
 * @author Sean A. Irvine
 */
public class A078706 extends Sequence1 {

  private Z mPrev = Z.ZERO;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(mPrev);
    while (!mSum.isProbablePrime()) {
      mPrev = mPrev.add(1);
      mSum = mSum.add(1);
    }
    return mPrev;
  }
}
