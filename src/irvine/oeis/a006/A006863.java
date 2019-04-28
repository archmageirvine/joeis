package irvine.oeis.a006;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006863 Denominator of B_{2n}/(-4n), where B_m are the Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A006863 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 4;

  @Override
  public Z next() {
    mN -= 4;
    if (mN == 0) {
      return Z.ONE;
    }
    mB.nextQ(); // skip odd terms
    return mB.nextQ().divide(mN).den();
  }
}

