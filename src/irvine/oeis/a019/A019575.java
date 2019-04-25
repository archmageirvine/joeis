package irvine.oeis.a019;

import irvine.math.MemoryFunction3;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019575 Place n distinguishable balls in n boxes <code>(in n^n</code> ways); let <code>T(n,k) =</code> number of ways that the maximum in <code>any</code> box is <code>k,</code> for <code>1 &lt;= k &lt;= n</code>; sequence gives triangle of numbers <code>T(n,k)</code>.
 * @author Sean A. Irvine
 */
public class A019575 extends MemoryFunction3<Integer, Q> implements Sequence {

  private int mN = 0;
  private Z mF = Z.ONE;
  private int mM = 0;

  @Override
  protected Q compute(final Integer n, final Integer i, final Integer k) {
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
