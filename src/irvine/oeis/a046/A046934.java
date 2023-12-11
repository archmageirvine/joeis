package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A046934 Same rule as Aitken triangle (A011971) except a(0,0)=1, a(1,0)=0.
 * @author Sean A. Irvine
 */
public class A046934 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0) {
      if (n == 0) {
        return Z.ONE;
      }
      if (n == 1) {
        return Z.ZERO;
      }
      return get(n - 1, n - 1);
    }
    return get(n, m - 1).add(get(n - 1, m - 1));
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
