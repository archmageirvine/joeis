package irvine.oeis.a019;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A019575 Place n distinguishable balls in n boxes (in n^n ways); let T(n,k) = number of ways that the maximum in any box is k, for 1 &lt;= k &lt;= n; sequence gives triangle of numbers T(n,k).
 * @author Sean A. Irvine
 */
public class A019575 extends MemoryFunctionInt3Sequence<Q> {

  private int mN = 0;
  private Z mF = Z.ONE;
  private int mM = 0;

  @Override
  protected Q compute(final int n, final int i, final int k) {
    if (n == 0) {
      return Q.ONE;
    }
    Q sum = Q.ZERO;
    if (i >= 1) {
      Z jf = Z.ONE;
      for (int j = 0; j <= Math.min(k, n); ++j) {
        if (j > 1) {
          jf = jf.multiply(j);
        }
        sum = sum.add(get(n - j, i - 1, k).divide(jf));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      mF = mF.multiply(++mN);
      mM = 1;
    }
    return get(mN, mN, mM).subtract(get(mN, mN, mM - 1)).multiply(mF).toZ();
  }
}
