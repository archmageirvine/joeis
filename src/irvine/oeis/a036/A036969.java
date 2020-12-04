package irvine.oeis.a036;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036969 Triangle read by rows: T(n,k) = T(n-1,k-1) + k^2*T(n-1,k), 1 &lt; k &lt;= n, T(n,1) = 1.
 * @author Sean A. Irvine
 */
public class A036969 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 1 || m > n) {
      return Z.ZERO;
    }
    if (m == 1) {
      return Z.ONE;
    }
    return get(n - 1, m - 1).add(get(n - 1, m).multiply(m).multiply(m));
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
