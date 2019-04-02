package irvine.oeis.a008;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008288 Square array of Delannoy numbers D(i,j) (i &gt;= 0, j &gt;= 0) read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A008288 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    return n == 0 || k == 0 ? Z.ONE : get(n, k - 1).add(get(n - 1, k - 1).add(get(n - 1, k)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM, mN - mM);
  }
}
