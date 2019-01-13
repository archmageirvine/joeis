package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicArray;

/**
 * A025494.
 * @author Sean A. Irvine
 */
public class A025494 implements Sequence {

  private final LongDynamicArray<Z> mSums = new LongDynamicArray<>();
  {
    // Slightly more complicated than A014597 because allows 0!
    mSums.set(0, Z.ZERO);
    mSums.set(1, Z.ONE); // 0! or 1!
    mSums.set(2, Z.TWO); // 0! + 1!
  }
  private long mPos = 0;
  private int mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final long len = mSums.length();
      if (++mPos >= len) {
        mF = mF.multiply(++mN);
        for (long k = 0, j = len; k < len; ++k, ++j) {
          mSums.set(j, mSums.get(k).add(mF));
        }
      }
      final Z v = mSums.get(mPos);
      v.sqrt();
      if (v.auxiliary() == 1) {
        return v;
      }
    }
  }
}
