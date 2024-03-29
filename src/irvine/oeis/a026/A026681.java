package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A026681 Triangular array T read by rows: T(n,0)=T(n,n)=1 for n &gt;= 0; for n &gt;= 2 and 1&lt;=k&lt;=n-1, T(n,k)=T(n-1,k-1)+T(n-1,k) if k or n-k is of form 2h for h=1,2,...,[ n/4 ], else T(n,k)=T(n-1,k-1)+T(n-2,k-1)+T(n-1,k).
 * @author Sean A. Irvine
 */
public class A026681 extends MemoryFunction2Sequence<Long, Z> {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A026681(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A026681() {
    super(1);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || m.equals(n)) {
      return Z.ONE;
    }
    if (((m & 1) == 0 && m / 2 <= n / 4) || (((n - m) & 1) == 0 && (n - m) / 2 <= n / 4)) {
      return get(n - 1, m - 1).add(get(n - 1, m));
    } else {
      return get(n - 1, m - 1).add(get(n - 1, m)).add(get(n - 2, m - 1));
    }
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
