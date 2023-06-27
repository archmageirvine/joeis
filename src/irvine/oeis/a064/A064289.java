package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A064289 Height of n-th term in Recam\u00e1n's sequence A005132.
 * @author Sean A. Irvine
 */
public class A064289 extends Sequence0 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = -1;
  private long mH = 0;
  private long mV = 0;

  @Override
  public Z next() {
    if (++mN == 0) {
      mSeen.set(0L);
      return Z.ZERO;
    }
    if (mV >= mN && !mSeen.isSet(mV - mN)) {
      mV -= mN;
      --mH;
    } else {
      mV += mN;
      ++mH;
    }
    mSeen.set(mV);
    return Z.valueOf(mH);
  }
}
