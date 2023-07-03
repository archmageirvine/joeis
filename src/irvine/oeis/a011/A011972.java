package irvine.oeis.a011;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A011972 Sequence formed by reading rows of triangle defined in A011971.
 * @author Sean A. Irvine
 */
public class A011972 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0) {
      if (n == 0) {
        return Z.ONE;
      }
      return get(n - 1, n - 1);
    }
    return get(n, m - 1).add(get(n - 1, m - 1));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
