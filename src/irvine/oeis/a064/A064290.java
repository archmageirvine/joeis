package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A064290 First number of height n in Recam\u00e1n's sequence A005132.
 * @author Sean A. Irvine
 */
public class A064290 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private long mM = 0;
  private int mH = 0;
  private long mV = 0;
  private int mN = -1;

  {
    mSeen.set(0L);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == 0) {
      ++mM;
      if (mV >= mM && !mSeen.isSet(mV - mM)) {
        mV -= mM;
        --mH;
      } else {
        mV += mM;
        ++mH;
      }
      mSeen.set(mV);
      if (mFirsts.get(mH) == 0) {
        mFirsts.set(mH, mV);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
