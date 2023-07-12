package irvine.oeis.a058;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A058843 Triangle T(n,k) = C_n(k) where C_n(k) = number of k-colored labeled graphs with n nodes (n &gt;= 1, 1&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A058843 extends MemoryFunctionInt2Sequence<Z> {

  /** Construct the sequence. */
  public A058843() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int k) {
    if (k == 1) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(1, n - 1, j -> Binomial.binomial(n, j).multiply(get(j, k - 1)).shiftLeft(j * (n - j))).divide(k);
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
