package irvine.oeis.a008;

import irvine.math.LongUtils;
import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008289 Triangle read by rows: <code>Q(n,m) =</code> number of partitions of n into m distinct parts, <code>n&gt;=1, m&gt;=1</code>.
 * @author Sean A. Irvine
 */
public class A008289 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (k <= 0 || n <= 0) {
      return Z.ZERO;
    }
    if (n == 1 && k == 1) {
      return Z.ONE;
    }
    return get(n - k, k).add(get(n - k, k - 1));
  }

  @Override
  public Z next() {
    if (++mM > (LongUtils.sqrt(8 * mN + 1) - 1) / 2) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
