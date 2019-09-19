package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A026166.
 * @author Sean A. Irvine
 */
public class A026166 implements Sequence {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  {
    mA.set(1L, 1L);
  }
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      ++mM;
      final long h = (mM - 1) / 2;
      final long l = mM - h;
      if (mA.get(l) == 0) {
        mA.set(l, mM);
      } else {
        mA.set(mM + h, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
