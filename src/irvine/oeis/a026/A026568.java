package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A026568 Irregular triangular array T read by rows: T(i,0) = T(i,2i) = 1 for i &gt;= 0; T(i,1) = T(i,2i-1) = [ (i+1)/2 ] for i &gt;= 1; and for i &gt;= 2 and 2 &lt;=j &lt;= i - 2, T(i,j) = T(i-1,j-2) + T(i-1,j-1) + T(i-1,j) if i + j is even, T(i,j) = T(i-1,j-2) + T(i-1,j) if i + j is odd.
 * @author Sean A. Irvine
 */
public class A026568 extends MemoryFunction2Sequence<Long, Z> {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A026568(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A026568() {
    super(1);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || m == 2 * n) {
      return Z.ONE;
    }
    if (m == 1 || m == 2 * n - 1) {
      return Z.valueOf((n + 1) / 2);
    }
    if (((n + m) & 1) == 0) {
      return get(n - 1, m - 2).add(get(n - 1, m - 1)).add(get(n - 1, m));
    } else {
      return get(n - 1, m - 2).add(get(n - 1, m));
    }
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
