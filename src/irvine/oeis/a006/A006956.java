package irvine.oeis.a006;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006956 Denominator of <code>(2n+1)(2n+2) B_{2n}</code>, where <code>B_n</code> are the Bernoulli numbers. Also denominators of the asymptotic expansion of the polygamma function <code>psi'''(z)</code>.
 * @author Sean A. Irvine
 */
public class A006956 implements Sequence {

  private long mN = -3;
  private final BernoulliSequence mB = new BernoulliSequence(1);

  @Override
  public Z next() {
    mN += 2;
    if (mN < 3) {
      return Z.ONE;
    }
    mB.nextQ(); // skip odd
    return mB.nextQ().multiply(mN).multiply(mN + 1).den();
  }
}
