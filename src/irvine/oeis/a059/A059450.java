package irvine.oeis.a059;

import irvine.oeis.memory.MemoryFunctionInt2Sequence;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A059450 Triangle read by rows: T(n,k) = Sum_{j=0..k-1} T(n,j) + Sum_{j=1..n-k} T(n-j,k), with T(0,0)=1 and T(n,k) = 0 for k &gt; n.
 * @author Sean A. Irvine
 */
public class A059450 extends MemoryFunctionInt2Sequence<Z> {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (m > n) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, m - 1, k -> get(n, k))
      .add(Integers.SINGLETON.sum(1, n - m, k -> get(n - k, m)));
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
