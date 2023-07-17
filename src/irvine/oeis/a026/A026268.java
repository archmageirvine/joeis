package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A026268 Triangle, T(n, k): T(n,k) = 1 for n &lt; 3, T(3,1) = T(3,2) = T(3,3) = 2, T(n,0) = 1, T(n,1) = n-1, T(n,n) = T(n-1,n-2) + T(n-1,n-1), otherwise T(n,k) = T(n-1,k-2) + T(n-1,k-1) + T(n-1,k), read by rows.
 * @author Sean A. Irvine
 */
public class A026268 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A026268() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A026268(final int offset) {
    super(offset);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || n <= 2) {
      return Z.ONE;
    }
    if (n == 3) {
      return Z.TWO;
    }
    if (m == 1) {
      return Z.valueOf(n - 1);
    }
    if (m.equals(n)) {
      return get(n - 1, n - 2).add(get(n - 1, n - 1));
    }
    return get(n - 1, m - 2).add(get(n - 1, m - 1)).add(get(n - 1, m));
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
