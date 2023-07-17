package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A026659 Triangular array T read by rows: T(n,0)=T(n,n)=1 for n &gt;= 0; for n &gt;= 2 and 1&lt;=k&lt;=n-1, if n is odd, then T(n,k)=T(n-1,k-1)+T(n-2,k-1)+T(n-1,k) if k is odd and &lt;=[ n/2 ] or if k is even and &gt;[ n/2 ]; in all other cases, T(n,k)=T(n-1,k-1)+T(n-1,k).
 * @author Sean A. Irvine
 */
public class A026659 extends MemoryFunction2Sequence<Long, Z> {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A026659(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A026659() {
    super(1);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || m.equals(n)) {
      return Z.ONE;
    }
    if ((n & 1) == 1 && ((m <= n / 2 && (m & 1) == 1) || (m > n / 2 && (m & 1) == 0))) {
      return get(n - 1, m - 1).add(get(n - 1, m)).add(get(n - 2, m - 1));
    } else {
      return get(n - 1, m - 1).add(get(n - 1, m));
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
