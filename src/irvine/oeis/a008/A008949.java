package irvine.oeis.a008;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A008949 Triangle read by rows of partial sums of binomial coefficients: T(n,k) = Sum_{i=0..k} binomial(n,i) (0 &lt;= k &lt;= n); also dimensions of Reed-Muller codes.
 * @author Sean A. Irvine
 */
public class A008949 extends MemoryFunction2Sequence<Integer, Z> {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (n < 0 || k > n) {
      return Z.ZERO;
    }
    if (k == 0) {
      return Z.ONE;
    }
    if (n.equals(k)) {
      return Z.ONE.shiftLeft(n);
    }
    return get(n - 1, k - 1).add(get(n - 1, k));
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
