package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075383 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mN = 0;
  private long mM = 0;
  private long mK = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mK = 0;
    }
    while (true) {
      mK += mN;
      if (!mUsed.isSet(mK)) {
        mUsed.set(mK);
        return Z.valueOf(mK);
      }
    }
  }
}
