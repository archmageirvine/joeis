package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A027023 Tribonacci array: triangular array T read by rows: T(n,0)=1 for n &gt;= 0, T(n,1) = T(n,2n) = 1 for n &gt;= 1, T(n,2)=1 for n &gt;= 2 and for n &gt;= 3, T(n,k) = T(n-1,k-3) + T(n-1,k-2) + T(n-1,k-1) for 3 &lt;= k &lt;= 2n-1.
 * @author Sean A. Irvine
 */
public class A027023 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A027023() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A027023(final int offset) {
    super(offset);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 0 || m > 2 * n) {
      return Z.ZERO;
    }
    if (m < 3 || m == 2 * n) {
      return Z.ONE;
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
