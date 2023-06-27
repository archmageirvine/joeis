package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.array.LongDynamicByteArray;

/**
 * A064288 Height of n when it appears for first time in Recam\u00e1n's sequence A005132.
 * @author Sean A. Irvine
 */
public class A064288 extends Sequence0 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  private long mM = 0;
  private long mN = -1;
  private byte mH = 0;
  private long mV = 0;

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.set(0L, (byte) 1);
      mSeen.set(0L);
      return Z.ZERO;
    }
    while (mA.get(mN) <= 0) {
      ++mM;
      if (mV >= mM && !mSeen.isSet(mV - mM)) {
        mV -= mM;
        --mH;
      } else {
        mV += mM;
        ++mH;
      }
      if (mA.get(mV) <= 0) {
        if (mH == Byte.MAX_VALUE) {
          throw new UnsupportedOperationException();
        }
        mA.set(mV, (byte) (mH + 1));
      }
      mSeen.set(mV);
    }
    return Z.valueOf(mA.get(mN) - 1);
  }
}
