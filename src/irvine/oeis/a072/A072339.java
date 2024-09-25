package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A072339.
 * @author Sean A. Irvine
 */
public class A072339 extends Sequence1 {

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      mM = mM == 0 ? 1 : mM << 1;
      mA.set(mM, 1);
      for (long k = 1; k < mM; ++k) {
        final int s = mA.get(k);
        if (s != 0) {
          final long tm = mM - k;
          if (mA.get(tm) == 0) {
            mA.set(tm, s + 1);
          }
        }
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
