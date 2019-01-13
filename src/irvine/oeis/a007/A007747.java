package irvine.oeis.a007;

import irvine.math.MemoryFunction4;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007747.
 * @author Sean A. Irvine
 */
public class A007747 extends MemoryFunction4<Long, Z> implements Sequence {

  private long mN = -1;

  @Override
  protected Z compute(final Long k, final Long l, final Long s, final Long x) {
    if (k > 1 && l * k <= s && s <= (x + 1 - k) * k) {
      Z sum = Z.ZERO;
      for (long i = l; i <= s / k; ++i) {
        sum = sum.add(get(k - 1, i, s - i, x));
      }
      return sum;
    }
    return k == 1 && l <= s && s <= x ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z next() {
    ++mN;
    return get(mN + 1, 0L, mN * (mN + 1), 2 * mN);
  }
}
