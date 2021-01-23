package irvine.oeis.a029;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029762 Numerator of Bernoulli(2n+2) - Bernoulli(2n).
 * @author Sean A. Irvine
 */
public class A029762 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private Q mA = mB.nextQ();

  @Override
  public Z next() {
    final Q t = mA;
    mB.nextQ();
    mA = mB.nextQ();
    return mA.subtract(t).num();
  }
}
