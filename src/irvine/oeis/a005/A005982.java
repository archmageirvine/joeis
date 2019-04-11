package irvine.oeis.a005;

import irvine.math.MemoryFunction3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005982 3 up, 3 down, 3 up, <code>...</code> permutations of length <code>3n+1</code>.
 * @author Sean A. Irvine
 */
public class A005982 extends MemoryFunction3<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private long mN = start();

  protected long size() {
    return 3;
  }

  protected long start() {
    return 1;
  }

  @Override
  protected Z compute(final Long u, final Long o, final Long t) {
    if (u + o == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    if (t == size()) {
      for (long j = 1; j <= o; ++j) {
        sum = sum.add(get(o - j, u + j - 1, 1L));
      }
    } else {
      for (long j = 1; j <= o; ++j) {
        sum = sum.add(get(u + j - 1, o - j, t + 1));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    mN += size();
    return get(0L, mN, 0L);
  }
}
