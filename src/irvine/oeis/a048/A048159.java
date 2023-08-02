package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A048159 Triangle giving a(n,k) = number of (n,k) labeled Greg trees (n &gt;= 2, 0 &lt;= k &lt;= n-2).
 * @author Sean A. Irvine
 */
public class A048159 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A048159() {
    super(2);
  }

  private int mN = 1;
  private int mM = 1;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m == 0) {
      return Z.valueOf(n).pow(n - 2);
    }
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    return get(n - 1, m - 1).multiply(n + m - 3)
      .add(get(n - 1, m).multiply(2L * n + 2L * m - 3))
      .add(get(n - 1, m + 1).multiply(m + 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 2;
    }
    return get(mN, mM - 2);
  }
}

