package irvine.oeis.a008;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A008957 Triangle of central factorial numbers T(2*n,2*n-2*k), k &gt;= 0, n &gt;= 1 (in Riordan's notation).
 * @author Sean A. Irvine
 */
public class A008957 extends MemoryFunction2Sequence<Integer, Z> {

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k == 1 || n.equals(k)) {
      return Z.ONE;
    }
    return get(n - 1, k - 1).add(get(n - 1, k).multiply(k * (long) k));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mN - mM);
  }
}
