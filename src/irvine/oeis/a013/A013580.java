package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A013580 Triangle formed in same way as Pascal's triangle (A007318) except 1 is added to central element in even-numbered rows.
 * @author Sean A. Irvine
 */
public class A013580 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m == 0 || m.equals(n)) {
      return Z.ONE;
    }
    final Z res = get(n - 1, m - 1).add(get(n - 1, m));
    return (n & 1) == 0 && n == 2 * m ? res.add(1) : res;
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
