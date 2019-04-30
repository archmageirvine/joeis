package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

/**
 * A003326 Nearest integer to <code>Bernoulli(2n)/(-4n)</code>.
 * @author Sean A. Irvine
 */
public class A003326 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 0;

  @Override
  public Z next() {
    mN -= 4;
    mB.nextQ();
    final Q b = mB.nextQ().divide(mN);
    return b.signedAdd(b.signum() > 0, Q.HALF).toZ();
  }
}
