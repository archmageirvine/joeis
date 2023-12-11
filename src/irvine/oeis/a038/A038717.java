package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A038717 Triangular array read by rows: T(n,m) = number of ways your team can score m points in n rounds of a soccer competition (loss=0 point, draw=1 point, win=3 points), for n &gt;= 0, 0 &lt;= m &lt;= 3n.
 * @author Sean A. Irvine
 */
public class A038717 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m <= 0) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    if (n == 0) {
      return Z.ZERO;
    }
    return get(n - 1, m).add(get(n - 1, m - 1)).add(get(n - 1, m - 3));
  }

  @Override
  public Z next() {
    if (++mM > 3 * mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
