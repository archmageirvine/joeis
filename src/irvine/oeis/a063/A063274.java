package irvine.oeis.a063;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.a001.A001694;
import irvine.util.array.DynamicIntArray;

/**
 * A063274 Number of powerful numbers (definition 1) required to sum to n.
 * @author Sean A. Irvine
 */
public class A063274 extends A001694 {

  private final DynamicIntArray mA = new DynamicIntArray();
  {
    mA.set(0, super.next().intValueExact()); // 1
  }
  private int mN = 0;
  private final MemoryFunction1<Integer> mB = new MemoryFunction1<>() {
    @Override
    protected Integer compute(final int n) {
      if (n == 0) {
        return 0;
      }
      while (n > mA.get(mA.length() - 1)) {
        mA.set(mA.length(), A063274.super.next().intValueExact());
      }
      int res = Integer.MAX_VALUE;
      for (int k = 0; k < mA.length() && mA.get(k) <= n; ++k) {
        res = Math.min(res, get(n - mA.get(k)) + 1);
      }
      return res;
    }
  };

  @Override
  public Z next() {
    return Z.valueOf(mB.get(++mN));
  }
}
