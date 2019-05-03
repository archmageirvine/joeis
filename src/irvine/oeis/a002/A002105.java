package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

/**
 * A002105 Reduced tangent numbers: <code>2^n*(2^{2n} - 1)*|B_{2n}|/n</code>, where <code>B_n =</code> Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A002105 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mB.nextQ();
    return mB.nextQ().abs().multiply(Z.ONE.shiftLeft(2 * mN).subtract(1).shiftLeft(mN)).toZ().divide(mN);
  }
}
