package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A026136 Lexicographically earliest permutation of the positive integers such that |a(n)-n| = [a(n)/2].
 * @author Sean A. Irvine
 */
public class A026136 extends Sequence1 {

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
        mA.set(mM + mM / 2, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
