package irvine.oeis.a048;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A048004 Triangular array read by rows: T(n,k) = number of binary vectors of length n whose longest run of consecutive 1's has length k, for n &gt;= 0, 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A048004 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 1 || m > n) {
      return Z.ZERO;
    }
    if (m == 1 || m.equals(n)) {
      return Z.ONE;
    }
    return get(n - 1, m).multiply2()
      .add(get(n - 1, m - 1))
      .subtract(get(n - 2, m - 1).multiply2())
      .add(get(n - m, m - 1))
      .subtract(get(n - m - 1, m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
