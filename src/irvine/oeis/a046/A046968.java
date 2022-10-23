package irvine.oeis.a046;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046968 Numerators of coefficients in Stirling's expansion for log(Gamma(z)).
 * @author Sean A. Irvine
 */
public class A046968 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    mB.nextQ(); // skip odd terms
    return select(mB.nextQ().divide(mN).divide(mN - 1));
  }
}

