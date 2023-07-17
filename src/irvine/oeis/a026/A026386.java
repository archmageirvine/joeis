package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A026386 Triangular array T read by rows: T(n,0) = T(n,n) = 1 for all n &gt;= 0; T(n,k) = T(n-1,k-1) + T(n-1,k) for even n and k = 1..n-1; T(n,k) = T(n-1,k-1) + T(n-1,k) + T(n-2,k-1) for odd n and k = 1 ..n-1.
 * @author Sean A. Irvine
 */
public class A026386 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A026386() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A026386(final int offset) {
    super(offset);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || m.equals(n)) {
      return Z.ONE;
    } else if (m < 0 || m > n) {
      return Z.ZERO;
    } else if ((n & 1) == 0) {
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
