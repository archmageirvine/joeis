package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A033877 Triangular array read by rows associated with Schroeder numbers: T(1,k) = 1; T(n,k) = 0 if k &lt; n; T(n,k) = T(n,k-1) + T(n-1,k-1) + T(n-1,k).
 * @author Sean A. Irvine
 */
public class A033877 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A033877() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 1) {
      return Z.ONE;
    }
    if (m < n) {
      return Z.ZERO;
    }
    return get(n, m - 1).add(get(n - 1, m - 1)).add(get(n - 1, m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mM, mN);
  }
}
