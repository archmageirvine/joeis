package irvine.oeis.a002;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002427 Numerator of (2n+1) B_{2n}, where B_n are the Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A002427 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    final Q t = mB.nextQ();
    mB.nextQ();
    mN = mN.add(2);
    return t.multiply(mN).num();
  }
}
