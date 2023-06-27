package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A064293 Last number of height n in Recam\u00e1n's sequence A005132.
 * @author Sean A. Irvine
 */
public class A064293 extends Sequence0 implements Conjectural {

  private static final int HEURISTIC_STEPS = 5000000;
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private final DynamicLongArray mLasts = new DynamicLongArray();
  private long mM = 0;
  private int mH = 0;
  private long mV = 0;
  private int mN = 0;
  {
    mSeen.set(0L);
  }

  @Override
  public Z next() {
    ++mN;
    for (int k = 0; k < mN * HEURISTIC_STEPS; ++k) {
      ++mM;
      if (mV >= mM && !mSeen.isSet(mV - mM)) {
        mV -= mM;
        --mH;
      } else {
        mV += mM;
        ++mH;
      }
      mSeen.set(mV);
      mLasts.set(mH, mV);
      if (mH < mN) {
        throw new UnsupportedOperationException("Heuristic broke");
      }
    }
    if (mLasts.get(mN) == 0) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(mLasts.get(mN));
  }
}
