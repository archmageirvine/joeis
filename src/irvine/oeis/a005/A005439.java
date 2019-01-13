package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

/**
 * A005439.
 * @author Sean A. Irvine
 */
public class A005439 implements Sequence {

  protected int mN = 0;
  private final BernoulliSequence mBernoulli = new BernoulliSequence(0);

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Q sum = Q.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(mBernoulli.get(mN + k + 1)
                    .multiply(Binomial.binomial(mN, k))
                    .multiply(Z.ONE.subtract(Z.ONE.shiftLeft(mN + k + 1))));
    }
    return sum.toZ().abs().multiply2();
  }
}

