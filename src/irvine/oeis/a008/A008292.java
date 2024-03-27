package irvine.oeis.a008;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.oeis.triangle.DirectArray;

/**
 * A008292 Triangle of Eulerian numbers T(n,k) (n &gt;= 1, 1 &lt;= k &lt;= n) read by rows.
 * @author Sean A. Irvine
 */
public class A008292 extends MemoryFunction2Sequence<Long, Z> implements DirectArray {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A008292(final int offset) {
    super(offset);
  }

  protected long mN = 0;
  protected long mM = 0;

  /** Construct the sequence. */
  public A008292() {
    super(1);
  }

  @Override
  public Z a(final int n, final int k) {
    return Integers.SINGLETON.sum(0, k, j -> Binomial.binomial(n + 1, j).multiply(Z.valueOf(k - j).pow(n))
      .multiply((j & 1) == 0 ? 1 : -1)); //  Sum_{j=0..k} (-1)^j * (k-j)^n * binomial(n+1, j).
  }

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n <= 0 || k <= 0) {
      return Z.ZERO;
    }
    if (n == 1 && k == 1) {
      return Z.ONE;
    }
    return get(n - 1, k).multiply(k).add(get(n - 1, k - 1).multiply(n - k + 1));
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
