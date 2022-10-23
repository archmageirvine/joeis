package irvine.oeis.a002;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002882 Nearest integer to Bernoulli number B_{2n}.
 * @author Sean A. Irvine
 */
public class A002882 extends Sequence0 {

  private final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    final Q b = mB.nextQ();
    final Z res = b.signedAdd(b.signum() >= 0, Q.HALF).toZ();
    mB.nextQ();
    return res;
  }
}
