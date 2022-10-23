package irvine.oeis.a006;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006953 a(n) = denominator of Bernoulli(2n)/(2n).
 * @author Sean A. Irvine
 */
public class A006953 extends Sequence1 {

  private long mN = 0;
  private final BernoulliSequence mB = new BernoulliSequence(1);

  @Override
  public Z next() {
    mN += 2;
    mB.nextQ(); // skip odd
    return mB.nextQ().divide(mN).den();
  }
}
