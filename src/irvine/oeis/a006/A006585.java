package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000058;

/**
 * A006585 Egyptian fractions: number of solutions to <code>1 =</code> 1/x_1 <code>+ ... +</code> 1/x_n in positive integers x_1 <code>&lt; ... &lt;</code> x_n.
 * @author Sean A. Irvine
 */
public class A006585 implements Sequence {

  private int mN = 0;
  private long mSolutions = 0;
  private Z[] mLimits = null;

  private void search(final Q sum, final Z prev, final int k) {
    if (sum.compareTo(Q.ONE) >= 0) {
      return; // Already too big
    }
    if (k == mLimits.length - 1) {
      final Q last = Q.ONE.subtract(sum);
      if (last.num().equals(Z.ONE) && last.den().compareTo(prev) > 0 && last.den().compareTo(mLimits[k]) <= 0) {
        ++mSolutions;
      }
      return;
    }
    for (Z xk = prev.add(1); xk.compareTo(mLimits[k]) <= 0; xk = xk.add(1)) {
      search(sum.add(new Q(Z.ONE, xk)), xk, k + 1);
    }
  }

  @Override
  public Z next() {
    ++mN;
    final Sequence limitSeq = new A000058();
    mLimits = new Z[mN];
    for (int k = 0; k < mLimits.length; ++k) {
      mLimits[k] = limitSeq.next().subtract(1).multiply(mN - k);
    }
    mSolutions = 0;
    search(Q.ZERO, Z.ZERO, 0);
    return Z.valueOf(mSolutions);
  }
}
