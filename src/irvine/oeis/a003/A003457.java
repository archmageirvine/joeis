package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

/**
 * A003457 a(n) = ceiling(Bernoulli(2n)/(-4n)).
 * @author Sean A. Irvine
 */
public class A003457 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 0;

  @Override
  public Z next() {
    mN -= 4;
    mB.nextQ();
    final Q b = mB.nextQ().divide(mN);
    return b.signum() > 0 ? b.add(1).toZ() : b.toZ();
  }
}
