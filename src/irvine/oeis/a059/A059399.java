package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059399 Triangular hopscotch.
 * @author Sean A. Irvine
 */
public class A059399 implements Sequence {

  private long mN = 0;
  private long mS = 0;
  private long mDelta = 0;
  private long mV = 0;

  @Override
  public Z next() {
    if (mDelta == 0) {
      mDelta = -mN;
      mS += ++mN;
      mV = mS;
    } else {
      mV += mDelta;
      if (mDelta > 0) {
        mDelta = 1 - mDelta;
      } else {
        mDelta = -1 - mDelta;
      }
    }
    return Z.valueOf(mV);
  }
}
