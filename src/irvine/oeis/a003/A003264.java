package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

/**
 * A003264 Floor((-4n)/Bernoulli(2n)).
 * @author Sean A. Irvine
 */
public class A003264 implements Sequence {

  private final BernoulliSequence mBernoulliSequence = new BernoulliSequence(0);
  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    final Q b = mBernoulliSequence.next();
    mBernoulliSequence.next(); // skip odd term
    final Q q = new Q(-2 * mN).divide(b);
    if (q.isInteger() || q.signum() >= 0) {
      return q.toZ();
    } else {
      return q.negate().toZ().negate().subtract(1);
    }
  }

}
