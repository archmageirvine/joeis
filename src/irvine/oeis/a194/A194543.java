package irvine.oeis.a194;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A194543 Triangle <code>T(n,k), n&gt;=0, 0&lt;=k&lt;=n</code>, read by rows: <code>T(n,k)</code> is the number of partitions of n into parts <code>p_i</code> such that <code>|p_i - p_j| &gt;=</code> k for i <code>!=</code> j.
 * @author Sean A. Irvine
 */
public class A194543 extends MemoryFunctionInt3<Z> implements Sequence {

  // After Alois P. Heinz

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int i, final int k) {
    if (n <= 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = k; j <= n - i; ++j) {
      sum = sum.add(get(n - i - j, i + j, k));
    }
    return sum;
  }

  protected Z t(final int n, final int k) {
    Z sum = n == 0 ? Z.ONE : Z.ZERO;
    for (int i = 1; i <= n; ++i) {
      sum = sum.add(get(n - i, i, k));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
