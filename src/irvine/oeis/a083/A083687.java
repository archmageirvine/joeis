package irvine.oeis.a083;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083687 Numerator of B(2n)*H(2n)/n*(-1)^(n+1) where B(k) is the k-th Bernoulli number and H(k) the k-th harmonic number.
 * @author Sean A. Irvine
 */
public class A083687 extends Sequence1 {

  private final HarmonicSequence mH = new HarmonicSequence();
  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mB.nextQ();
    mH.nextQ();
    return select(mB.nextQ().multiply(mH.nextQ()).divide(++mN)).abs();
  }
}
