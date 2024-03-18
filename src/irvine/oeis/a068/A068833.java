package irvine.oeis.a068;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000290;
import irvine.util.array.DynamicArray;

/**
 * A068833 Start of the first occurrence of exactly n consecutive squares with digit sum also a square.
 * @author Sean A. Irvine
 */
public class A068833 extends A000290 {

  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = -1;
  private Z mS = super.next();

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z start = mS;
      int cnt = 0;
      while (LongUtils.isSquare(ZUtils.digitSum(mS))) {
        mS = super.next();
        ++cnt;
      }
      if (mFirsts.get(cnt) == null) {
        mFirsts.set(cnt, start);
      }
      if (mS.equals(start)) {
        mS = super.next();
      }
    }
    return mFirsts.get(mN);
  }
}
