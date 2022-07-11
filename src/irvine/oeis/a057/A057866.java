package irvine.oeis.a057;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057866 Sum_{k&gt;=1} 1/(tanh(k*Pi) * k^(4n-1)) = Pi^(4n-1)*A057866(n)/A057867(n).
 * @author Sean A. Irvine
 */
public class A057866 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private int mN = -1;
  private Z mF = Z.ONE;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 4;
    if (mN > 1) {
      mF = mF.multiply(mN + 1).multiply(mN).multiply(mN - 1).multiply(mN - 2);
    }
    Q sum = Q.ZERO;
    for (int k = 0; k <= mN + 1; k += 2) {
      sum = sum.signedAdd((k & 2) == 2, mB.get(k).multiply(mB.get(mN + 1 - k)).multiply(Binomial.binomial(mN + 1, k)));
    }
    return select(sum.multiply(Z.ONE.shiftLeft(mN - 1)).divide(mF));
  }
}
