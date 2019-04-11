package irvine.oeis.a008;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008292 Triangle of Eulerian numbers T(n,k) <code>(n &gt;= 1, 1 &lt;=</code> k <code>&lt;= n)</code> read by rows.
 * @author Sean A. Irvine
 */
public class A008292 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n <= 0 || k <= 0) {
      return Z.ZERO;
    }
    if (n == 1 && k == 1) {
      return Z.ONE;
    }
    return get(n - 1, k).multiply(k).add(get(n - 1, k - 1).multiply(n - k + 1));
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
