package irvine.oeis.a037;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037254 Triangle read by rows: <code>T(n,k) (n &gt;= 1, 1 &lt;=</code> k&lt; <code>= n)</code> gives number of <code>non-distorting tie-avoiding</code> integer vote weights.
 * @author Sean A. Irvine
 */
public class A037254 extends MemoryFunction2<Long, Z> implements Sequence {

  @Override
  protected Z compute(final Long n, final Long k) {
    if (k == 1) {
      if (n == 1) {
        return Z.ONE;
      }
      return get(n - 1, (n + 1L) / 2);
    }
    return get(n, 1L).add(get(n - 1, k - 1));
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}

