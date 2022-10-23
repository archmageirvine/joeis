package irvine.oeis.a006;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A006956 Denominator of (2n+1)(2n+2) B_{2n}, where B_n are the Bernoulli numbers. Also denominators of the asymptotic expansion of the polygamma function psi'''(z).
 * @author Sean A. Irvine
 */
public class A006956 extends Sequence3 {

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
