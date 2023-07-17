package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A026769 Triangular array T read by rows: T(n,0)=T(n,n)=1 for n &gt;= 0; T(2,1)=2; for n &gt;= 3 and 1&lt;=k&lt;=n-1, T(n,k) = T(n-1,k-1) + T(n-2,k-1) + T(n-1,k) if 1&lt;=k&lt;=(n-1)/2, else T(n,k) = T(n-1,k-1) + T(n-1,k).
 * @author Sean A. Irvine
 */
public class A026769 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A026769() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A026769(final int offset) {
    super(offset);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || m.equals(n)) {
      return Z.ONE;
    }
    if (n == 2) {
      return Z.TWO;
    }
    if (m <= (n - 1) / 2) {
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
