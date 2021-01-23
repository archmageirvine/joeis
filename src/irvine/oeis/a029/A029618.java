package irvine.oeis.a029;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029618 Numbers in (3,2)-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A029618 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m == 0) {
      return Z.THREE;
    }
    if (n.equals(m)) {
      return Z.TWO;
    }
    return get(n - 1, m - 1).add(get(n - 1, m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
