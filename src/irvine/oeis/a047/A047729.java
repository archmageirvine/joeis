package irvine.oeis.a047;

import irvine.math.MemoryFunction4;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047729 Number of score sequences in tournament with n players, when 3 points are awarded in each game.
 * @author Sean A. Irvine
 */
public class A047729 extends MemoryFunction4<Long, Z> implements Sequence {

  // todo this not right

  private long mN = -1;

  @Override
  protected Z compute(final Long k, final Long l, final Long s, final Long x) {
    if (k > 1 && 2 * l * k <= 3 * s && 2 * s <= (2 * x + 3 - 3 * k) * k) {
      Z sum = Z.ZERO;
      for (long i = l; 2 * k * i <= 3 * s; ++i) {
        sum = sum.add(get(k - 1, i, 2 * s - 3 * i, x));
      }
      return sum;
    }
    return k == 1 && 2 * l <= 3 * s && 3 * s <= 2 * x ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z next() {
    ++mN;
    return get(mN + 1, 0L, mN * (2 * mN + 3) / 2, 3 * mN);
  }
}
