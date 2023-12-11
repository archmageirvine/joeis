package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A007785 Number of sets of positive integers &lt;= n^2 whose sum is (n^3 + n)/2.
 * @author Sean A. Irvine
 */
public class A007785 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;

  @Override
  protected Z compute(final Long target, final Long max) {
    if (target == 0) {
      return Z.ONE;
    }
    Z count = Z.ZERO;
    for (long k = max; k > 0 && k * (k + 1) >= 2 * target; --k) {
      count = count.add(get(target - k, k - 1));
    }
    return count;
  }

  @Override
  public Z next() {
    ++mN;
    return get((mN * mN * mN + mN) / 2, mN * mN);
  }

}
