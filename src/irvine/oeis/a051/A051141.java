package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A051141 Triangle read by rows: a(n, m) = S1(n, m)*3^(n-m), where S1 are the signed Stirling numbers of first kind A008275 (n &gt;= 1, 1 &lt;= m &lt;= n).
 * @author Sean A. Irvine
 */
public class A051141 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = 0;
  private long mM = 0;

  /** Construct the sequence. */
  public A051141() {
    super(1);
  }

  protected long multiplier() {
    return 3;
  }

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    if (m > n) {
      return Z.ZERO;
    }
    return get(n - 1, m - 1).subtract(get(n - 1, m).multiply(multiplier() * (n - 1)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
