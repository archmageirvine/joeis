package irvine.oeis.a026;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026835 Triangular array read by rows: <code>T(n,k) =</code> number of partitions of n into distinct parts in which every part is <code>&gt;=k</code>, for <code>k=1,2,...,n</code>.
 * @author Sean A. Irvine
 */
public class A026835 extends MemoryFunctionInt3<Z> implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m, final int leastPart) {
    if (n < 0) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    if ((m - leastPart) * (m + leastPart + 1) < 2 * n) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= Math.min(1, n / m); ++k) {
      sum = sum.add(get(n - m * k, m - 1, leastPart));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mN, mM);
  }
}
