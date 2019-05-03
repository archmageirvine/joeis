package irvine.oeis.a006;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006955 Denominator of <code>(2n+1) B_{2n}</code>, where <code>B_n</code> are the Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A006955 implements Sequence {

  private long mN = -1;
  private final BernoulliSequence mB = new BernoulliSequence(1);

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.ONE;
    }
    mB.nextQ(); // skip odd
    return mB.nextQ().multiply(mN).den();
  }
}
