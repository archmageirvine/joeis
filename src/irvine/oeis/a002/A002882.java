package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

/**
 * A002882 Nearest integer to Bernoulli number B_{2n}.
 * @author Sean A. Irvine
 */
public class A002882 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    final Q b = mB.next();
    final Z res = b.signedAdd(b.signum() >= 0, Q.HALF).toZ();
    mB.next();
    return res;
  }
}
