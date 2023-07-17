package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A027082 Irregular triangular array: T(n,0) = 1 for n &gt;= 1; T(n,1) = T(n,2) = 1 for n &gt;= 1; T(n,k) = T(n-1,k-3) + T(n-1,k-2) + T(n-1,k-1) for 3 &lt;= k &lt;= 2n-1 and n &gt;= 2; and T(n,2n) = T(n-1,2n-3) + T(n-1,2n-2) for n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A027082 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A027082() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A027082(final int offset) {
    super(offset);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 0 || m > 2 * n) {
      return Z.ZERO;
    }
    if (m <= 2) {
      return Z.ONE;
    }
    if (m == 2 * n) {
      return get(n - 1, 2 * n - 3).add(get(n - 1, 2 * n - 2));
    }
    return get(n - 1, m - 3).add(get(n - 1, m - 2)).add(get(n - 1, m - 1));
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
