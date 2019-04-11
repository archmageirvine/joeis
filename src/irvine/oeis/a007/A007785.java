package irvine.oeis.a007;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007785 Number of sets of positive integers <code>&lt;= n^2</code> whose sum is <code>(n^3 + n)/2</code>.
 * @author Sean A. Irvine
 */
public class A007785 extends MemoryFunction2<Long, Z> implements Sequence {

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
