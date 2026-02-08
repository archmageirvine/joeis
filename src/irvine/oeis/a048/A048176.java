package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A048176 Triangle read by rows: T(n, m) = S1(n, m)*10^(n-m), where S1 are the signed Stirling numbers of first kind A008275 (n &gt;= 1, 1 &lt;= m &lt;= n).
 * @author Sean A. Irvine
 */
public class A048176 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A048176() {
    super(1);
  }

  private int mM = 0;
  private int mN = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m == 0 || n < m) {
      return Z.ZERO;
    }
    if (n.equals(m)) {
      return Z.ONE;
    }
    return get(n - 1, m - 1).subtract(get(n - 1, m).multiply(10L * n - 10));
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

