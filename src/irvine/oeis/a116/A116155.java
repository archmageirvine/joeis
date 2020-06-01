package irvine.oeis.a116;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A116155 Triangle <code>T(n,k)</code> defined by: <code>T(0,0)=1, T(n,k)=0</code> if k <code>&lt; 0</code> or k &gt; n, <code>T(n,k) = T(n-1,k-1) + k*T(n-1,k) + Sum_{j&gt;=1} T(n-1,k+j}</code>.
 * @author Sean A. Irvine
 */
public class A116155 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (k < 0 || k > n) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = get(n - 1, k - 1).add(get(n - 1, k).multiply(k));
    for (long j = k + 1; j < n; ++j) {
      sum = sum.add(get(n - 1, j));
    }
    return sum;
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

