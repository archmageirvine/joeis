package irvine.oeis.a059;

import irvine.oeis.memory.MemoryFunctionInt2Sequence;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a003.A003319;

/**
 * A059438 Triangle T(n,k) (1 &lt;= k &lt;= n) read by rows: T(n,k) is the number of permutations of [1..n] with k components.
 * @author Sean A. Irvine
 */
public class A059438 extends MemoryFunctionInt2Sequence<Z> {

  private final MemorySequence mP = new A003319();
  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (n < m) {
      return Z.ZERO;
    }
    if (m == 1) {
      return mP.a(n);
    }
    return Integers.SINGLETON.sum(1, n, k -> get(n - k, m - 1).multiply(mP.a(k)));
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
