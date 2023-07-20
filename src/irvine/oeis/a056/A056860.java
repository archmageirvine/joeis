package irvine.oeis.a056;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000110;

/**
 * A056860 Triangle T(n,k) = number of element-subset partitions of {1..n} with n-k+1 equalities (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A056860 extends Sequence1 {

  private final MemorySequence mBell = MemorySequence.cachedSequence(new A000110());
  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return Binomial.binomial(n - 1, m - 1).multiply(mBell.a(m - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}

