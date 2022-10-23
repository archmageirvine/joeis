package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A026142 Lexicographically earliest permutation of the positive integers such that for n &gt;= 2, |a(n)-n| = [(a(n)+1)/2].
 * @author Sean A. Irvine
 */
public class A026142 extends Sequence1 {

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
      final long h = (mM + 1) / 2;
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
