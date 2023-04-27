package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a002.A002113;
import irvine.util.array.DynamicArray;

/**
 * A062388 Smallest palindrome with digit sum = n.
 * @author Sean A. Irvine
 */
public class A062388 extends A002113 implements SequenceWithOffset {

  private final DynamicArray<Z> mA = new DynamicArray<>();
  private int mN = -1;

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == null) {
      final Z p = super.next();
      final int digitSum = (int) ZUtils.digitSum(p);
      if (mA.get(digitSum) == null) {
        mA.set(digitSum, p);
      }
    }
    return mA.get(mN);
  }
}
