package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002378;
import irvine.util.array.DynamicLongArray;

/**
 * A048529 a(n) is the smallest value of m such that A002378(m), the m-th oblong number, contains exactly n 0's.
 * @author Sean A. Irvine
 */
public class A048529 extends A002378 {

  private final DynamicLongArray mFirst = new DynamicLongArray();
  private int mN = 0;
  private long mM = 0; // offset by 1 since we use 0 as sentinel

  protected int digit() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirst.get(mN) == 0) {
      ++mM;
      final int zeros = ZUtils.digitCounts(super.next())[digit()];
      if (mFirst.get(zeros) == 0) {
        mFirst.set(zeros, mM);
      }
    }
    return Z.valueOf(mFirst.get(mN) - 1);
  }
}
