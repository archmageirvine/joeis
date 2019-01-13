package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

/**
 * A003414.
 * @author Sean A. Irvine
 */
public class A003414 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 0;

  @Override
  public Z next() {
    mN -= 4;
    mB.next();
    final Q b = mB.next().divide(mN);
    return b.signum() > 0 ? b.toZ() : b.subtract(1).toZ();
  }
}
