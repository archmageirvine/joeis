package irvine.oeis.a007;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A007754 Array (a frieze pattern) defined by a(n,k) = (a(n-1,k)*a(n-1,k+1) - 1) / a(n-2,k+1), read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A007754 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n <= 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    return get(n - 1, k).multiply(n + k).subtract(get(n - 2, k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM, mN - mM);
  }
}

