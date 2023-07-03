package irvine.oeis.a027;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A027960 'Lucas array': triangular array T read by rows.
 * @author Sean A. Irvine
 */
public class A027960 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || m == 2 * n) {
      return Z.ONE;
    } else if (m == 1) {
      return Z.THREE;
    } else {
      return get(n - 1, m - 2).add(get(n - 1, m - 1));
    }
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
