package irvine.oeis.a050;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050925 Numerator of (n+1)*Bernoulli(n).
 * @author Sean A. Irvine
 */
public class A050925 extends Sequence0 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(mB.nextQ().multiply(++mN));
  }
}
