package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A384034 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A384034 extends Sequence1 {

  private LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mM = -1;
  private long mR = 1;
  {
    mA.set(0, 1);
  }

  @Override
  public Z next() {
    if (++mM >= mA.length()) {
      final LongDynamicLongArray next = new LongDynamicLongArray();
      for (long k = 0, j = 0; k < mA.length(); ++k) {
        next.set(j++, mA.get(k));
        for (long i = 0; i < mA.get(k); ++i) {
          next.set(j++, ++mR);
        }
      }
      mA = next;
      mM = 0;
    }
    return Z.valueOf(mA.get(mM));
  }
}
