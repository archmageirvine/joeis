package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A038792 Rectangular array defined by T(i,1) = T(1,j) = 1 for i &gt;= 1 and j &gt;= 1; T(i,j) = max(T(i-1,j) + T(i-1,j-1), T(i-1,j-1) + T(i,j-1)) for i &gt;= 2, j &gt;= 2, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A038792 extends MemoryFunction2Sequence<Long, Z> {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A038792(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A038792() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 1 || m == 1) {
      return Z.ONE;
    }
    return get(n - 1, m).add(get(n - 1, m - 1)).max(get(n - 1, m - 1).add(get(n, m - 1)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN + 1 - mM, mM);
  }
}
