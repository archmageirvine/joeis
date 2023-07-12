package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A020474 A Motzkin triangle: a(n,k), n &gt;= 2, 2 &lt;= k &lt;= n, = number of complete, strictly subdiagonal staircase functions.
 * @author Sean A. Irvine
 */
public class A020474 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A020474() {
    super(2);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (k < 0 || n < k) {
      return Z.ZERO;
    }
    if (k == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    return get(n, k - 1).add(get(n - 1, k - 1)).add(get(n - 2, k - 1));
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
