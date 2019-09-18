package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A026136.
 * @author Sean A. Irvine
 */
public class A026136 implements Sequence {

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
      final long l = mM - mM / 2;
      if (mA.get(l) == 0) {
        mA.set(l, mM);
      } else {
        final long r = mM + mM / 2;
        mA.set(r, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
