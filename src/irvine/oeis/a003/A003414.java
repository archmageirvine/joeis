package irvine.oeis.a003;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003414 Floor( Bernoulli(2*n)/(-4*n) ).
 * @author Sean A. Irvine
 */
public class A003414 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 0;

  @Override
  public Z next() {
    mN -= 4;
    mB.nextQ();
    final Q b = mB.nextQ().divide(mN);
    return b.signum() > 0 ? b.toZ() : b.subtract(1).toZ();
  }
}
