package irvine.oeis.a007;

import irvine.math.MemoryFunction4;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007747 Number of nonnegative integer points (p_1,p_2,...,p_n) in polytope defined by p_0 = p_{n+1} <code>= 0,</code> 2p_i - (p_{i+1} + p_{i-1}) <code>&lt;= 2,</code> p_i <code>&gt;= 0, i=1,...,n.</code> Number of score sequences in a chess tournament with <code>n+1</code> players (with 3 outcomes for each game).
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
