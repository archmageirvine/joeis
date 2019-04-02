package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

/**
 * A001332 Bernoulli(2*n) * (2*n + 1)!.
 * @author Sean A. Irvine
 */
public class A001332 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Q b = mB.next();
    mB.next();
    if (++mN > 1) {
      mF = mF.multiply(mN);
      mF = mF.multiply(++mN);
    }
    return b.multiply(mF).toZ();
  }
}
