package irvine.oeis.a035;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A035317 Pascal-like triangle associated with A000670.
 * @author Sean A. Irvine
 */
public class A035317 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0) {
      return Z.ONE;
    }
    if (n.equals(m)) {
      return Z.valueOf(n / 2 + 1);
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
