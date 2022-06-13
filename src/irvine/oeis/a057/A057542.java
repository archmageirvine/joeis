package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a038.A038776;

/**
 * A057542 Maximum cycle length in each permutation between A038776[1] and A038776[A000108[n]].
 * @author Sean A. Irvine
 */
public class A057542 extends A000108 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new PrependSequence(new A038776(), 0));
  private int mN = 0;
  private int mLongest = 1;
  {
    super.next();
  }

  @Override
  public Z next() {
    final int lim = super.next().intValueExact();
    while (++mN < lim) {
      int m = mN;
      int cnt = 0;
      do {
        m = mA.a(m).intValueExact();
        ++cnt;
      } while (m != mN);
      if (cnt > mLongest) {
        mLongest = cnt;
      }
    }
    return Z.valueOf(mLongest);
  }
}
