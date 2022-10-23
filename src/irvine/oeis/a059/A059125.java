package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A059125 A self-generated dragon-like folding sequence.
 * @author Sean A. Irvine
 */
public class A059125 extends Sequence0 {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private long mR = 1;
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN >= mR) {
      long t = mR;
      if (mA.isSet(mM++)) {
        mA.set(mR);
      }
      ++mR;
      while (--t >= 0) {
        if (!mA.isSet(t)) {
          mA.set(mR);
        }
        ++mR;
      }
    }
    return mA.isSet(mN) ? Z.ONE : Z.ZERO;
  }
}

