package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A048160 Triangle giving T(n,k) = number of (n,k) labeled rooted Greg trees (n &gt;= 1, 0&lt;=k&lt;=n-1).
 * @author Sean A. Irvine
 */
public class A048160 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A048160() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m == 0) {
      return Z.valueOf(n).pow(n - 1);
    }
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    return get(n - 1, m - 1).multiply(n + m - 2)
      .add(get(n - 1, m).multiply(2L * n + 2L * m - 2))
      .add(get(n - 1, m + 1).multiply(m + 1));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}

