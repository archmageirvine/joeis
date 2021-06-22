package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002378;
import irvine.util.array.DynamicArray;

/**
 * A048530 Smallest pronic number containing exactly n 0's.
 * @author Sean A. Irvine
 */
public class A048530 extends A002378 {

  private final DynamicArray<Z> mFirst = new DynamicArray<>();
  private int mN = 0;

  protected int digit() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirst.get(mN) == null) {
      final Z pronic = super.next();
      final int zeros = ZUtils.digitCounts(pronic)[digit()];
      if (mFirst.get(zeros) == null) {
        mFirst.set(zeros, pronic);
      }
    }
    return mFirst.get(mN);
  }
}
