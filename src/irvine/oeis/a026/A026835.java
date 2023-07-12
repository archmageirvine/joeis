package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A026835 Triangular array read by rows: T(n,k) = number of partitions of n into distinct parts in which every part is &gt;=k, for k=1,2,...,n.
 * @author Sean A. Irvine
 */
public class A026835 extends MemoryFunctionInt3Sequence<Z> {

  /** Construct the sequence. */
  public A026835() {
    super(1);
  }

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
